package com.kosuri.stores.model.request;


import java.util.List;


public class MapTaskForRoleRequest {
    private Integer roleId;
    private String updatedBy;
    private List<Integer>taskIds;
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public List<Integer> getTaskIds() {
        return taskIds;
    }
    public void setTaskIds(List<Integer> taskIds) {
        this.taskIds = taskIds;
    }




}

