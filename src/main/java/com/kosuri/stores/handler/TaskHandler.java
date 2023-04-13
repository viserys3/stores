package com.kosuri.stores.handler;


import com.kosuri.stores.dao.TaskEntity;
import com.kosuri.stores.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TaskHandler {
    @Autowired
    private TaskRepository taskRepository;


    public List<TaskEntity> getAllTasks(){
        List<TaskEntity> taskList = new ArrayList<TaskEntity>();
        taskRepository.findAll().forEach(task -> taskList.add(task));
        return taskList;
    }


}

