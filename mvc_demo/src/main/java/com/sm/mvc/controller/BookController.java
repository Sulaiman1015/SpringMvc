package com.sm.mvc.controller;

import com.sm.mvc.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody List<Book> books){
        System.out.println("save book -> "+books);
        return "book saved successful";
    }

    @GetMapping
    public List<Book> getAll(){

        Book b1 = new Book();
        b1.setType("SO");
        b1.setName("Linux");
        b1.setDescription("Basic and Practice");

        Book b2 = new Book();
        b2.setType("SO");
        b2.setName("Unix");
        b2.setDescription("Basic and Practice");

        Book b3 = new Book();
        b3.setType("IT");
        b3.setName("Java");
        b3.setDescription("Language and Developer");

        return new ArrayList<>(Arrays.asList(b1, b2, b3));
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable Integer id){
        Book b1 = new Book();
        b1.setType("SO");
        b1.setName("Linux");
        b1.setDescription("Basic and Practice");
        System.out.println("get book n°"+id);
        return b1;
    }

    @PutMapping
    public Book update(@RequestBody Book book){
        System.out.println("update book "+book);
        return book;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("delete book n°"+id);
        return "book delete successful";
    }

}
