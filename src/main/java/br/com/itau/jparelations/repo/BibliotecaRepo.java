package br.com.itau.jparelations.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.jparelations.model.Biblioteca;

public interface BibliotecaRepo extends CrudRepository<Biblioteca, Long> {

}
