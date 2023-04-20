package com.kosuri.stores.model.request;

import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;


import java.net.URI;


public class CreateRoleRequest extends RequestEntity<CreateRoleRequest> {
    public CreateRoleRequest(HttpMethod method, URI url) {
        super(method, url);
    }


    @NotNull
    private Integer roleId;
    @NotNull
    private String roleName;
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

