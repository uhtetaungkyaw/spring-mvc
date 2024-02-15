package org.ace.springmvc.service;

import org.ace.springmvc.model.Book;

import java.util.List;

public interface BookService {
    void save(Book book);
    List<Book> findAll();
    Book findById(Long id);
}
