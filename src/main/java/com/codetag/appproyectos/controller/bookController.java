/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.appproyectos.controller;

import com.codetag.appproyectos.jpa.Book;
import com.codetag.appproyectos.jpa.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author proy-dim
 */
@Controller
@RequestMapping("/book")
public class bookController {

    @Autowired
    BookRepository bookRepo;

    @RequestMapping("/")
    public String book(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "book";
    }

    @RequestMapping("/create")
    public String create(Model model) {
        return "create";
    }

    @RequestMapping("/save")
    public String save(@RequestParam String nombre) {
        Book bk = new Book();
        bk.setName(nombre);
        bookRepo.save(bk);
        return "redirect:/show/" + bk.getId();
    }

    @RequestMapping("/show/{id}")
    public String show(@PathVariable int id, Model model) {
        model.addAttribute("book", bookRepo.findOne(id));
        return "show";
    }
    
      @RequestMapping("/edit/{id}")
    public String edit(@PathVariable int  id, Model model) {
        model.addAttribute("book", bookRepo.findOne(id));
        return "edit";
    }
    
    
     @RequestMapping("/delete")
    public String delete(@RequestParam int id) {
        Book bk = bookRepo.findOne(id);
        bookRepo.delete(bk);
        return "redirect:/book";
    }
    
        @RequestMapping("/update")
     public String update(@RequestParam int id,@RequestParam String name) {
        Book bk = bookRepo.findOne(id); 
        bk.setName(name);
        bookRepo.save(bk);
        return "redirect:/show/" + bk.getId();

    }
    

}
