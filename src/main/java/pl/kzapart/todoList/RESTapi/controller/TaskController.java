package pl.kzapart.todoList.RESTapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.kzapart.todoList.RESTapi.dto.TaskRequest;
import pl.kzapart.todoList.RESTapi.dto.TaskResponse;
import pl.kzapart.todoList.RESTapi.model.Task;
import pl.kzapart.todoList.RESTapi.service.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody TaskRequest taskRequest)
    {
        taskService.save(taskRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("by-team/{id}")
    public ResponseEntity<List<TaskResponse>> getTasksByTeam(Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getTasksByTeam(id));
    }

}
