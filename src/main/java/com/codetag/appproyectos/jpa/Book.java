/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.appproyectos.jpa;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book{
    private int id;
    private String name;
    private Set<BookPublisher> bookPublishers;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
        bookPublishers = new HashSet<>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<BookPublisher>   getBookPublishers() {
        return bookPublishers;
    }

    public void setBookPublishers(Set<BookPublisher> bookPublishers) {
        this.bookPublishers = bookPublishers;
    }
}