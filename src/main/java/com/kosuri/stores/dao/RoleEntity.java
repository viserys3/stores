package com.kosuri.stores.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "role_pharma")
public class RoleEntity {

    @Column(name="RoleId")
    private Integer roleId;

    @Column(name="Role_Name",nullable = true, length = 45)
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

