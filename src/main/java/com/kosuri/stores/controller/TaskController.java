package com.kosuri.stores.controller;

import com.kosuri.stores.dao.TaskEntity;
import com.kosuri.stores.handler.RepositoryHandler;
import com.kosuri.stores.handler.TaskHandler;
import org.springframework.beans.factory.annotation.Autowired;


import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Task")
public class TaskController {
    @Autowired
    private RepositoryHandler repositoryHandler;
    @Autowired
    private TaskHandler taskHandler;


    @GetMapping("/getTasks")
    public List<TaskEntity> getAllTasks() throws IOException {
        return taskHandler.getAllTasks();
    }
}

