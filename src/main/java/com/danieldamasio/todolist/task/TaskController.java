package com.danieldamasio.todolist.task;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping(value = "hello_world")
    public String helloWorld() {
        return "hello world!";
    }
    
    @GetMapping
    public List<Task> listAllTasks() {
        return taskService.listAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Task> findTaskById(@PathVariable Long id) {
        Optional<Task> task = taskService.findByID(id);
        return task.map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build()
        );
    }


    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.save(task);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.remove(id);
        return ResponseEntity
            .noContent()
            .build();
    }
}
