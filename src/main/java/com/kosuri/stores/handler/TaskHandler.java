package com.kosuri.stores.handler;


import com.kosuri.stores.dao.TaskEntity;
import com.kosuri.stores.dao.TaskRepository;
import com.kosuri.stores.dao.TaskRoleEntity;
import com.kosuri.stores.dao.TaskRoleRepository;
import com.kosuri.stores.exception.APIException;
import com.kosuri.stores.model.response.GetTasksForRoleResponse;
import com.kosuri.stores.model.role.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class TaskHandler {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskRoleRepository taskRoleRepository;


    public List<TaskEntity> getAllTasks(){
        List<TaskEntity> taskList = new ArrayList<TaskEntity>();
        taskRepository.findAll().forEach(task -> taskList.add(task));
        return taskList;
    }

    public void mapTaskRoleEntityFromRequest(Integer roleId,List<Integer>taskIds,String updatedBy) throws Exception {

        for(Integer taskId: taskIds) {
            TaskRoleEntity tempTaskRole = new TaskRoleEntity();
            tempTaskRole.setTaskId(taskId);
            Optional<TaskEntity> taskEntityOptional = taskRepository.findById(taskId);

            if (taskEntityOptional.isEmpty()) {
                throw new APIException(String.format("Task with id {} not found", taskId));
            }

            tempTaskRole.setTaskName(taskEntityOptional.get().getTaskName());
            tempTaskRole.setRoleId(roleId);
            tempTaskRole.setUpdatedBy(updatedBy);
            LocalDate localDate = LocalDate.now();
            tempTaskRole.setUpdatedDate(localDate.toString());
            try {
                taskRoleRepository.save(tempTaskRole);
            } catch(Exception e){
                System.out.println(e.getCause());
            }
        }

    }


    public GetTasksForRoleResponse fetchAllTaskOfRole(Integer roleId) {
        List<TaskRoleEntity> savedTaskForRole = taskRoleRepository.findByRoleId(roleId);
        List<Task> taskList = new ArrayList<>();

        for(TaskRoleEntity taskRoleEntity: savedTaskForRole) {
            Task task = new Task();
            task.setTaskId(taskRoleEntity.getTaskId());
            task.setTaskName(taskRoleEntity.getTaskName());
            taskList.add(task);
        }
        GetTasksForRoleResponse getTasksForRoleResponse = new GetTasksForRoleResponse();
        getTasksForRoleResponse.setTaskEntityList(taskList);
        return getTasksForRoleResponse;

    }



}

