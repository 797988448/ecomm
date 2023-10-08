package com.sawnkalabihar.encompasses.handling.service;

import com.sawnkalabihar.encompasses.handling.repo.Bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    Bookrepo bookrepo;
}
