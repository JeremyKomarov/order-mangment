package com.firstProject.controller;

import com.firstProject.studentService.InternalStudent;
import com.firstProject.studentService.InternalStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    InternalStudentService internalStudentService;

    @GetMapping("internalStudent/{id}")
    public InternalStudent getInternalStudentById(@PathVariable Long id) {
        return internalStudentService.getInternalStudentById(id);
    }
}
