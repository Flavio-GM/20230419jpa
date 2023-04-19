package br.com.itau.jparelations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.jparelations.model.Autor;
import br.com.itau.jparelations.repo.AutorRepo;

@Service
public class AutorService {

    @Autowired
    private AutorRepo repo;

    public Autor getAutor(long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteAutor(long id) {
        repo.deleteById(id);
    }
}
