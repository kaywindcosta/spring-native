package com.kaywin.service;

import com.kaywin.model.Book;
import com.kaywin.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public record BookService(BookRepository bookRepository) {

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findById(long id) {
        Optional optional = bookRepository.findById(id);
        Book book = Objects.isNull(optional) ? null : (Book) optional.get();
        return book;
    }

    public Optional findById1(long id) {
        return bookRepository.findById(id);
    }

    public List<Book> findByName(String name) {
        return bookRepository.findByName(name);
    }
}
