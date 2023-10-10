package com.sawnkalabihar.encompasses.handling.service;

import com.sawnkalabihar.encompasses.handling.Model.Book;
import com.sawnkalabihar.encompasses.handling.repo.Bookrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    Bookrepo bookrepo;

    public String AddAllBook(Book newBook) {
        bookrepo.save(newBook);
        return "Add Book";
    }

    public List<Book> getAllBook() {
        return bookrepo.findAll();
    }

    public String UpdatePrice(String id, String price) {
        Book book=bookrepo.findById(id).orElse(null);
        if(book!=null){
            book.setPrice(price);
            bookrepo.save(book);
            return "Update  Price";
        }
        return "Does not Match Id";

    }

    public String DeleteBook(String id) {
        bookrepo.deleteById(id);
        return "Delete BOOK";
    }
}
