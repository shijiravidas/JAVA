package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DemoModel;
import com.example.demo.service.DemoService;

// import ikm.example.employee.model.Employee;
// import ikm.example.employee.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor

@RequestMapping("/demo")
public class demoController {
    private final DemoService dmoservice;

    @PostMapping("/create")

    public ResponseEntity<String> createEmployee(@RequestBody @Valid DemoModel dmo) {
        if (dmo.getName().isEmpty() || dmo.getDesignation().isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Bad request on validation error\n");
        }
        dmoservice.saveDemo(dmo);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("HTTP Status will be CREATED (CODE 201)\n Demo ID: " + dmo.getEmpid());
    }
}
