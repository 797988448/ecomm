package com.sawnkalabihar.encompasses.handling.repo;

import com.sawnkalabihar.encompasses.handling.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepo extends JpaRepository<Book,String> {
}
