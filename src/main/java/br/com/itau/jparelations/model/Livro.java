package br.com.itau.jparelations.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Livro {
    @Id
    @GeneratedValue
    private long Id;

    private String titulo;

    @ManyToOne
    @JoinColumn(name = "id_biblioteca")
    @JsonIgnoreProperties("livros")
    private Biblioteca biblioteca;

    @ManyToMany(mappedBy = "livros")
    private List<Autor> autores;
}
