package org.projetointegrador.unifio.javawithhexagonalarchitecture.adapters.outbounds.repositories;

import org.projetointegrador.unifio.javawithhexagonalarchitecture.adapters.mappers.BookMapper;
import org.projetointegrador.unifio.javawithhexagonalarchitecture.domain.book.Book;
import org.projetointegrador.unifio.javawithhexagonalarchitecture.domain.book.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private final JpaBookRepository jpaBookRepository;
    private final BookMapper bookMapper;

    public BookRepositoryImpl(JpaBookRepository jpaBookRepository, BookMapper bookMapper) {
        this.jpaBookRepository = jpaBookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> getAllBooks() {
        return jpaBookRepository.findAll()
                .stream()
                .map(bookMapper::toDomain)
                .collect(Collectors.toList());
    }
}
