package com.sawnkalabihar.encompasses.handling.controller;

import com.sawnkalabihar.encompasses.handling.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

}
