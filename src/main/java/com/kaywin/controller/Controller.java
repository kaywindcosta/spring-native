package com.kaywin.controller;

import com.kaywin.model.Book;
import com.kaywin.request.BookRequest;
import com.kaywin.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class Controller {

    private final BookService bookService;

    public Controller(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public ResponseEntity<String> home(){
        log.info("Home Page responding");
        return new ResponseEntity<String>("Spring Native", HttpStatus.OK);
    }

    @PostMapping("/book")
    public ResponseEntity<Book> saveBook(@RequestBody BookRequest book){
        return new ResponseEntity<Book>(bookService.saveBook(new Book(book.getName())), HttpStatus.OK);
    }

    @GetMapping("/book")
    public ResponseEntity<List<Book>> findBookByName(@RequestParam String name){
        return new ResponseEntity<List<Book>>(bookService.findByName(name), HttpStatus.OK);
    }

    @GetMapping("/findAllBooks")
    public ResponseEntity<List<Book>> findAllBooks(){
        return new ResponseEntity<List<Book>>(bookService.findAllBooks(), HttpStatus.OK);
    }

}
