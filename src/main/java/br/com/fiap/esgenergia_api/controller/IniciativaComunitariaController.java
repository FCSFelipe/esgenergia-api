package br.com.fiap.esgenergia_api.controller;

import br.com.fiap.esgenergia_api.model.IniciativaComunitaria;
import br.com.fiap.esgenergia_api.repository.IniciativaComunitariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/iniciativas")
public class IniciativaComunitariaController {

    @Autowired
    private IniciativaComunitariaRepository repository;

    @GetMapping
    public List<IniciativaComunitaria> listarTodas() {
        return repository.findAll();
    }

    @PostMapping
    public IniciativaComunitaria criar(@RequestBody IniciativaComunitaria iniciativa) {
        return repository.save(iniciativa);
    }
}