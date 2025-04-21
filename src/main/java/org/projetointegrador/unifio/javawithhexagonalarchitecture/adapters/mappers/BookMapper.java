package org.projetointegrador.unifio.javawithhexagonalarchitecture.adapters.mappers;

import org.mapstruct.Mapper;
import org.projetointegrador.unifio.javawithhexagonalarchitecture.adapters.outbounds.entities.JpaBook;
import org.projetointegrador.unifio.javawithhexagonalarchitecture.domain.book.Book;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toDomain(JpaBook entity);

    JpaBook toEntity(Book book);
}
