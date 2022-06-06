package com.projects.management.services;

import com.projects.management.model.Manager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ManagerService {
    Manager createManager(Manager manager);

    List<Manager> getAllManagers();

    boolean deleteManager(Long id);

    Manager geManagerById(Long id);


    Manager updateManager(Long id, Manager manager);
}
