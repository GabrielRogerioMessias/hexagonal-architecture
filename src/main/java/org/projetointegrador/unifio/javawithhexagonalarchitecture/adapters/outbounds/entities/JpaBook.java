package org.projetointegrador.unifio.javawithhexagonalarchitecture.adapters.outbounds.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_book")
@Data
public class JpaBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private Integer yearOfRelease;
    private String gender;
}
