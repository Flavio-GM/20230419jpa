package br.com.itau.jparelations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.jparelations.dto.BibliotecaDTO;
import br.com.itau.jparelations.model.Biblioteca;
import br.com.itau.jparelations.service.BibliotecaService;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {

    @Autowired
    private BibliotecaService service;

    @GetMapping("/ender/{id}")
    public ResponseEntity<Biblioteca> getBibliotecaComEndereco(@PathVariable long id) {
        Biblioteca biblioteca = service.getBibliotecaComEndereco(id);

        if (biblioteca == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(biblioteca);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BibliotecaDTO> getBiblioteca(@PathVariable long id) {
        BibliotecaDTO biblioteca = service.getBiblioteca(id);

        if (biblioteca == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(biblioteca);
    }
}
