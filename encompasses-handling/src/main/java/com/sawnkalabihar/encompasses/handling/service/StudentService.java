package com.sawnkalabihar.encompasses.handling.service;

import com.sawnkalabihar.encompasses.handling.Model.Student;
import com.sawnkalabihar.encompasses.handling.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    Studentrepo studentrepo;

    public String AddStudentId(Student newstudent) {
        studentrepo.save(newstudent);
        return "Added Students";
    }

    public List<Student> getAllStudent() {
        return studentrepo.findAll();
    }

    public String UpdateStudent(String id, String branch) {
        Student student=studentrepo.findById(id).orElse(null);
        if(student!=null){
            student.setBranch(branch);
            studentrepo.save(student);
            return "Update Branch ";
        }
        return "Does not exits";

    }

    public String DeleteStudent(String id) {
        studentrepo.deleteById(id);
        return "Delete ID ="+" "+id;
    }
}
