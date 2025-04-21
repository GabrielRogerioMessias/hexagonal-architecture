package org.projetointegrador.unifio.javawithhexagonalarchitecture.application.services;


import org.projetointegrador.unifio.javawithhexagonalarchitecture.application.usecases.BookUseCases;
import org.projetointegrador.unifio.javawithhexagonalarchitecture.domain.book.Book;
import org.projetointegrador.unifio.javawithhexagonalarchitecture.domain.book.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookUseCases {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }
}
