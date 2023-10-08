package com.sawnkalabihar.encompasses.handling.controller;

import com.sawnkalabihar.encompasses.handling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
}
