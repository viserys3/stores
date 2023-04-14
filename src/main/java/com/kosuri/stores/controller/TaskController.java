package com.kosuri.stores.controller;

import com.kosuri.stores.dao.TaskEntity;
import com.kosuri.stores.handler.RepositoryHandler;
import com.kosuri.stores.handler.TaskHandler;
import com.kosuri.stores.model.response.GetTasksForRoleResponse;
import org.springframework.beans.factory.annotation.Autowired;


import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private RepositoryHandler repositoryHandler;
    @Autowired
    private TaskHandler taskHandler;


    @GetMapping("/getAll")
    public List<TaskEntity> getAllTasks() throws IOException {
        return taskHandler.getAllTasks();
    }

    @PostMapping("/map")
    public void mapTaskRoleEntityFromRequest() {
        taskHandler.mapTaskRoleEntityFromRequest();
    }


    @GetMapping("/get")
    public ResponseEntity<GetTasksForRoleResponse> fetchAllTaskOfRole(Integer roleId) {
        try {
            GetTasksForRoleResponse response = taskHandler.fetchAllTaskOfRole(roleId);
            return ResponseEntity.status(HttpStatus.OK).body(response);
        } catch (Exception e) {
            GetTasksForRoleResponse response = new GetTasksForRoleResponse();
            response.setResponseMessage(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

}

