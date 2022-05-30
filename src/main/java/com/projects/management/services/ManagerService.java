package com.projects.management.services;

import com.projects.management.model.Manager;
import org.springframework.stereotype.Service;

@Service
public interface ManagerService {
    Manager createManager(Manager manager);
}
