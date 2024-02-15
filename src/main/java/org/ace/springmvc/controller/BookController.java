package org.ace.springmvc.controller;

import org.ace.springmvc.model.Book;
import org.ace.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    //1st phrase
    @GetMapping("/book/add")
    public String showForm(Model model) {
        Book book = new Book();
        model.addAttribute("newBook", book);
        return "books/addBook";
    }

    //2nd phrase
    @PostMapping("/book/add")
    public String getBook(Book book, Model model) {

        bookService.save(book);
        model.addAttribute("newBook", book);
        return "books/addBook";

    }

    @GetMapping("/books")
    public String showBooks(Model model) {

        List<Book> books =bookService.findAll();
        model.addAttribute("books", books);
        return "books/books";
    }

}
