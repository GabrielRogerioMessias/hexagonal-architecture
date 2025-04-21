package org.projetointegrador.unifio.javawithhexagonalarchitecture.adapters.outbounds.repositories;

import org.projetointegrador.unifio.javawithhexagonalarchitecture.adapters.outbounds.entities.JpaBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBookRepository extends JpaRepository<JpaBook, Long> {
}
