package org.gagan.todoapplication.services;

import org.gagan.todoapplication.models.Task;
import org.gagan.todoapplication.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public void deleteTask(UUID id){
        taskRepository.deleteById(id);
    }
    public void toggleTask(UUID id){
        Task task = taskRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid task id"));
        task.setCompleted(!task.getCompleted());
        taskRepository.save(task);
    }
}
