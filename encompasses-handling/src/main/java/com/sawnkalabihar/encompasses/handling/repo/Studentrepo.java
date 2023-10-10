package com.sawnkalabihar.encompasses.handling.repo;

import com.sawnkalabihar.encompasses.handling.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepo extends JpaRepository<Student,String> {
}
