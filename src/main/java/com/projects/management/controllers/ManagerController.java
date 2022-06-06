package com.projects.management.controllers;

import com.projects.management.model.Manager;
import com.projects.management.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin( origins = "http://localhost:3010/")
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

    @GetMapping("manager")
    public List<Manager> getManagers(){
        return managerService.getAllManagers();
    }

    @DeleteMapping("manager/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteManager(@PathVariable Long id) {
        boolean deleted = false;
        deleted = managerService.deleteManager(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("manager/{id}")
    public ResponseEntity<Manager> getManagerById(@PathVariable Long id) {
        Manager manager = null;
        manager = managerService.geManagerById(id);
        return ResponseEntity.ok(manager);
    }

    @PutMapping("manager/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable Long id,
                                                   @RequestBody Manager manager) {
        manager = managerService.updateManager(id, manager);
        return ResponseEntity.ok(manager);
    }
}
