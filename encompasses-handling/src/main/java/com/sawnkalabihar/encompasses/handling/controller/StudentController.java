package com.sawnkalabihar.encompasses.handling.controller;

import com.sawnkalabihar.encompasses.handling.Model.Student;
import com.sawnkalabihar.encompasses.handling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("Api/post/student")
    public String AddStudentId(@RequestBody Student newstudent){
        return studentService.AddStudentId(newstudent);

    }
    @GetMapping("Api/get/Student")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PutMapping("Api/update/branch")
    public String UpdateStudent(@RequestParam String id,@RequestParam String branch){
        return studentService.UpdateStudent(id,branch);
    }
    @DeleteMapping("Api/Delete/Student")
    public String DeleteStudent(@RequestParam String id){
        return studentService.DeleteStudent(id);
    }
}
