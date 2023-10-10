package com.sawnkalabihar.encompasses.handling.service;

import com.sawnkalabihar.encompasses.handling.Model.Course;
import com.sawnkalabihar.encompasses.handling.repo.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    Courserepo courserepo;

    public String AddCourses(Course newCourse) {
        courserepo.save(newCourse);
        return "Added Courses";
    }

    public List<Course> getAllCourse() {
        return courserepo.findAll();
    }

    public String Update(String id, String title) {
        Course course=courserepo.findById(id).orElse(null);
        if(course!=null){
            course.setTitle(title);
            courserepo.save(course);
            return "Update Course";
        }
        return "NOT Match Id";
    }

    public String DeleteCourse(String id) {
        courserepo.deleteById(id);
        return "Delete Course";
    }
}
