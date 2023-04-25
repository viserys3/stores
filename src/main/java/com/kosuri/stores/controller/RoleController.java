package com.kosuri.stores.controller;

import com.kosuri.stores.handler.RepositoryHandler;
import com.kosuri.stores.handler.RoleHandler;
import com.kosuri.stores.handler.TaskHandler;
import com.kosuri.stores.model.request.CreateRoleRequest;
import com.kosuri.stores.model.request.GetTasksForRoleRequest;
import com.kosuri.stores.model.response.GetAllRolesResponse;
import com.kosuri.stores.model.response.GetTasksForRoleResponse;
import org.springframework.beans.factory.annotation.Autowired;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RepositoryHandler repositoryHandler;
    @Autowired
    private RoleHandler roleHandler;

    @Autowired
    private TaskHandler taskHandler;

    @PostMapping("/add")
    public ResponseEntity<Object> createRoleEntityFromRequest(@Valid @RequestBody CreateRoleRequest request) {
        try {
            roleHandler.createRoleEntityFromRequest(request.getRoleId(),request.getRoleName());
            return ResponseEntity.status(HttpStatus.OK).body("Role created successfully!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<GetAllRolesResponse> getListOfRoles() {
        GetAllRolesResponse response = new GetAllRolesResponse();
        try {
            response = roleHandler.getAllRoles();
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            response.setResponseMessage(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }

    }

    @GetMapping("/getTasks")
    public ResponseEntity<GetTasksForRoleResponse> fetchAllTaskOfRole(@RequestBody @Valid GetTasksForRoleRequest request) {
        try {
            GetTasksForRoleResponse response = taskHandler.fetchAllTaskOfRole(request);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            GetTasksForRoleResponse response = new GetTasksForRoleResponse();
            response.setResponseMessage(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }
}

