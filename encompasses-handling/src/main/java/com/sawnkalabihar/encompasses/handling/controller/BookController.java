package com.sawnkalabihar.encompasses.handling.controller;

import com.sawnkalabihar.encompasses.handling.Model.Book;
import com.sawnkalabihar.encompasses.handling.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("api/add/book")
    public String AddAllBook(@RequestBody Book newBook){
        return bookService.AddAllBook(newBook);
    }
    @GetMapping("Api/get/book")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }
    @PutMapping("api/UpData/book")
    public String UpdatePrice(@RequestParam String id,@RequestParam String price){
        return bookService.UpdatePrice(id,price);
    }
    @DeleteMapping("API/Delete/Book")
    public String DeleteBook(@RequestParam String id){
        return bookService.DeleteBook(id);
    }

}
