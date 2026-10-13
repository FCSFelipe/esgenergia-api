package br.com.fiap.esgenergia_api.controller;

import br.com.fiap.esgenergia_api.model.DispositivoIot;
import br.com.fiap.esgenergia_api.repository.DispositivoIotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dispositivos")
public class DispositivoIotController {
    @Autowired
    private DispositivoIotRepository repository;

    @GetMapping
    public List<DispositivoIot> listarTodos() { return repository.findAll(); }
}