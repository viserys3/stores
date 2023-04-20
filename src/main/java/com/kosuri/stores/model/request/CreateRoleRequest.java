package com.kosuri.stores.model.request;

import com.kosuri.stores.model.enums.Role;
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
    private Role roleName;
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public Role getRoleName() {
        return roleName;
    }
    public void setRoleName(Role roleName) {
        this.roleName = roleName;
    }
}

