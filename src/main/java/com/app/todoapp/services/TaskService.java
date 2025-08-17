package com.app.todoapp.services;

import org.springframework.stereotype.Service;
import com.app.todoapp.models.Task;
import java.util.List;
import com.app.todoapp.repository.TaskRepository;

@Service  
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return this.taskRepository.findAll();
    }
      

}
