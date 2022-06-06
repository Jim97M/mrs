package com.projects.management.services;

import com.projects.management.entity.ManagerEntity;
import com.projects.management.model.Manager;
import com.projects.management.repository.ManagerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManagerServiceImpl implements ManagerService {

    ManagerRepository managerRepository;

    public ManagerServiceImpl(ManagerRepository managerRepository){
       this.managerRepository = managerRepository;
    }

    @Override
    public Manager createManager(Manager manager) {
        ManagerEntity managerEntity = new ManagerEntity();

        BeanUtils.copyProperties(manager, managerEntity);

        managerRepository.save(managerEntity);
        return manager;
    }

    @Override
    public List<Manager> getAllManagers() {
        List<ManagerEntity> managerEntities = managerRepository.findAll();

        List<Manager> managers = managerEntities.stream().map(mng -> new Manager(
                mng.getId(),
                mng.getFirstName(),
                mng.getLastName(),
                mng.getEmailId()
        )).collect(Collectors.toList());
        return managers;
    }

    @Override
    public boolean deleteManager(Long id) {
        ManagerEntity manager = managerRepository.findById(id).get();
        managerRepository.delete(manager);
        return true;
    }

    @Override
    public Manager geManagerById(Long id) {
        ManagerEntity managerEntity
                = managerRepository.findById(id).get();
        Manager manager = new Manager();
        BeanUtils.copyProperties(managerEntity, manager);
        return manager;
    }

    @Override
    public Manager updateManager(Long id, Manager manager) {
        ManagerEntity managerEntity
                = managerRepository.findById(id).get();
        managerEntity.setEmailId(manager.getEmailId());
        managerEntity.setFirstName(manager.getFirstName());
        managerEntity.setLastName(manager.getLastName());
        managerRepository.save(managerEntity);
        return manager;
    }
}

