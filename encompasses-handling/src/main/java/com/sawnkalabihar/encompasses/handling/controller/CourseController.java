package com.sawnkalabihar.encompasses.handling.controller;

import com.sawnkalabihar.encompasses.handling.Model.Course;
import com.sawnkalabihar.encompasses.handling.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("Api/Add/Course")
    public String AddCourses(@RequestBody Course newCourse){
        return courseService.AddCourses(newCourse);
    }
    @GetMapping("Api/get/course")
    public List<Course> getAllCourse(){
        return courseService.getAllCourse();
    }
    @PutMapping("Api/update/title")
    public String UpdateCourse(@RequestParam String id,@RequestParam String title){
        return courseService.Update(id,title);
    }
    @DeleteMapping("Api/Delete/course")
    public String DeleteCourse(@RequestParam String id){
        return courseService.DeleteCourse(id);
    }

}
