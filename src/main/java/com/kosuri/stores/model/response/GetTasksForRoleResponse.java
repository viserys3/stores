package com.kosuri.stores.model.response;

import com.kosuri.stores.model.role.Task;

import java.util.List;

public class GetTasksForRoleResponse extends GenericResponse {
    private List<Task> taskEntityList;

    public List<Task> getTaskEntityList() {
        return taskEntityList;
    }

    public void setTaskEntityList(List<Task> taskEntityList) {
        this.taskEntityList = taskEntityList;
    }
}
