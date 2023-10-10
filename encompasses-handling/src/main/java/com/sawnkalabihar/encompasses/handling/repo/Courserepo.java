package com.sawnkalabihar.encompasses.handling.repo;

import com.sawnkalabihar.encompasses.handling.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Courserepo extends JpaRepository<Course,String> {
}
