package br.com.fiap.esgenergia_api.controller;

import br.com.fiap.esgenergia_api.model.LeituraConsumo;
import br.com.fiap.esgenergia_api.repository.LeituraConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/leituras")
public class LeituraConsumoController {
    @Autowired
    private LeituraConsumoRepository repository;

    @GetMapping
    public List<LeituraConsumo> listarTodas() { return repository.findAll(); }
}