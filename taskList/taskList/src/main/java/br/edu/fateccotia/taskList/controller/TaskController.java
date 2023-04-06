package br.edu.fateccotia.taskList.controller;

import br.edu.fateccotia.taskList.enums.TaskStatus;
import br.edu.fateccotia.taskList.model.Task;
import br.edu.fateccotia.taskList.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping()
    public ResponseEntity<?> findAll() {
        //  List<Task> list = new ArrayList<Task>();
        //  list.add(new Task(1, "Atividade 1", TaskStatus.DONE));
        //   list.add(new Task(2, "Atividade 2", TaskStatus.PENDING));
        //  list.add(new Task(3, "Atividade 3", TaskStatus.DELETED));

        List<Task> list = taskService.findAll();

        return ResponseEntity.ok(list);
    }

    @PostMapping
    public ResponseEntity<Task> save(@RequestBody Task task) {
        Task taskCreated = taskService.save(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(taskCreated);

    }
}

