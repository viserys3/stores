package com.kosuri.stores.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "role_management")
public class TaskEntity {

    @Column(name="Task_ID")
    private Integer taskId;

    @Column(name="Task_Name",nullable = true, length = 45)
    private String taskName;


    public Integer getTaskId() {
        return taskId;
    }


    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }


    public String getTaskName() {
        return taskName;
    }


    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }



}
