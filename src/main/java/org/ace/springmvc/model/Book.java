package org.ace.springmvc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Author author;

    public Book() {

    }
    public Book(String name, String description, String price) {
        this.name = name;
        this.description = description;

    }
}
