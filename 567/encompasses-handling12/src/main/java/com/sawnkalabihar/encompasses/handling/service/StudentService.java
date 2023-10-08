package com.sawnkalabihar.encompasses.handling.service;

import com.sawnkalabihar.encompasses.handling.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    Studentrepo studentrepo;
}
