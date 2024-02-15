package org.ace.springmvc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;

    @OneToMany
    private List<Book> books;

    public Author() {
    }
    public Author(String name, String  genre) {
        this.name = name;
        this.genre = genre;
    }
}
