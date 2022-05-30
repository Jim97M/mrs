package com.projects.management.controllers;

import com.projects.management.model.Manager;
import com.projects.management.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin( origins = "http://localhost:8081/")
@RestController
@RequestMapping("/api/v1/")
public class ManagerController {
    @Autowired
    ManagerService managerService;

    public ManagerController(ManagerService managerService){
        this.managerService = managerService;
    }

    @PostMapping("manager")
    public Manager createManager(@RequestBody Manager manager){
       return managerService.createManager(manager);
    }
}
