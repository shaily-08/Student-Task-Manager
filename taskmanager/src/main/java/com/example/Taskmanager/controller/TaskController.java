package com.example.Taskmanager.controller;

import com.example.Taskmanager.model.Task;
import com.example.Taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TaskController {

    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Task> getTasks() {
        return repo.findAll();
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return repo.save(task);
    }
}
