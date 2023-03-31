package com.kosuri.stores.dao;

import com.kosuri.stores.model.user.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user_info")
public class UserEntity {
    private @Column(name = "USER_ID") int id;
    @NotNull
    private @Column(name = "User_Name") String username;
    @NotNull
    private @Column(name = "User_Ph_No") String phoneNumber;
    @NotNull
    private @Column(name = "User_Category") String category;
    @NotNull
    private @Column(name = "Status") String status;
    @NotNull
    private @Column(name = "Role") String role;
    @NotNull
    private @Column(name = "Password") String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
