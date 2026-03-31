package com.example.taskmanager.controller;
import com.example.taskmanager.entity.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService service;
    public TaskController(TaskService service){this.service=service;}

    @PostMapping public Task create(@RequestBody Task t){return service.save(t);}
    @GetMapping public List<Task> getAll(){return service.getAll();}
    @GetMapping("/{id}") public Task get(@PathVariable Long id){return service.getById(id);}
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
    @GetMapping("/status/{s}") public List<Task> byStatus(@PathVariable String s){return service.getByStatus(s);}
}