package com.example.taskmanager.service;
import com.example.taskmanager.entity.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository repo;
    public TaskService(TaskRepository repo){this.repo=repo;}

    public Task save(Task t){return repo.save(t);}
    public List<Task> getAll(){return repo.findAll();}
    public Task getById(Long id){return repo.findById(id).orElseThrow();}
    public void delete(Long id){repo.deleteById(id);}
    public List<Task> getByStatus(String s){return repo.findByStatus(s);}
}