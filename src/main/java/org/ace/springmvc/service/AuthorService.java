package org.ace.springmvc.service;

import org.ace.springmvc.model.Author;

import java.util.List;

public interface AuthorService {
    void save(Author author);
    List<Author> findAll();

}
