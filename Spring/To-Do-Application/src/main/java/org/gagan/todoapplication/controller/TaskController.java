package org.gagan.todoapplication.controller;

import org.gagan.todoapplication.models.Task;
import org.gagan.todoapplication.repository.TaskRepository;
import org.gagan.todoapplication.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    @Autowired
    private final TaskRepository taskRepository;

    public TaskController(TaskService taskService, TaskRepository taskRepository) {
        this.taskService = taskService;
        this.taskRepository = taskRepository;
    }

    @PostMapping("/add")
    public String addTask(@RequestParam String title, @RequestParam(defaultValue = "false") boolean completed) {
        Task task = new Task(title, completed);
        taskRepository.save(task);
        return "redirect:/tasks";
    }

    @GetMapping
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping("/{id}/delete")
    public String deleteTasks(@PathVariable UUID id) {
        taskService.deleteTask(id);
        return "redirect:/tasks";
    }

    @PostMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable UUID id) {
        taskService.toggleTask(id);
        return "redirect:/tasks";
    }
}
