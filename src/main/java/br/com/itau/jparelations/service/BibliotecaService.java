package br.com.itau.jparelations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.jparelations.dto.BibliotecaDTO;
import br.com.itau.jparelations.model.Biblioteca;
import br.com.itau.jparelations.repo.BibliotecaRepo;

@Service
public class BibliotecaService {
    @Autowired
    private BibliotecaRepo repo;

    public Biblioteca getBibliotecaComEndereco(long id) {
        return repo.findById(id).orElse(null);
    }

    public BibliotecaDTO getBiblioteca(long id) {
        Biblioteca biblioteca = repo.findById(id).orElse(null);
        BibliotecaDTO dto = new BibliotecaDTO(biblioteca.getId(), biblioteca.getName());

        return dto;
    }
}
