package org.projetointegrador.unifio.javawithhexagonalarchitecture.adapters.inbounds.controllers;

import org.projetointegrador.unifio.javawithhexagonalarchitecture.application.services.BookServiceImpl;
import org.projetointegrador.unifio.javawithhexagonalarchitecture.domain.book.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok().body(this.bookService.getAllBooks());
    }
}
