package br.com.itau.jparelations.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.jparelations.model.Autor;

public interface AutorRepo extends CrudRepository<Autor, Long> {
}
