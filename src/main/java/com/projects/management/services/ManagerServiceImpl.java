package com.projects.management.services;

import com.projects.management.entity.ManagerEntity;
import com.projects.management.model.Manager;
import com.projects.management.repository.ManagerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

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
}
