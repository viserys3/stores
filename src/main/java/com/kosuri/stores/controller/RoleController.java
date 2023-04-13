package com.kosuri.stores.controller;

import com.kosuri.stores.dao.RoleEntity;
import com.kosuri.stores.handler.RepositoryHandler;
import com.kosuri.stores.handler.RoleHandler;
import com.kosuri.stores.model.request.CreateRoleRequest;
import org.springframework.beans.factory.annotation.Autowired;


import java.io.IOException;
import java.util.List;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Role")
public class RoleController {
    @Autowired
    private RepositoryHandler repositoryHandler;
    @Autowired
    private RoleHandler roleHandler;


    @PostMapping("/addRole")
    public void createRoleEntityFromRequest(@Valid @RequestBody CreateRoleRequest request) throws IOException {


        roleHandler.createRoleEntityFromRequest(request.getRoleId(),request.getRoleName());
    }


    @GetMapping("/getRoles")
    public List<RoleEntity> getListOfRoles() throws IOException {
        return roleHandler.getAllRoles();
    }
}

