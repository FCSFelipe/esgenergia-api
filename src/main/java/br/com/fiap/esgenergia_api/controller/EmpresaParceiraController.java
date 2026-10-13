package br.com.fiap.esgenergia_api.controller;

import br.com.fiap.esgenergia_api.model.EmpresaParceira;
import br.com.fiap.esgenergia_api.repository.EmpresaParceiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaParceiraController {
    @Autowired
    private EmpresaParceiraRepository repository;

    @GetMapping
    public List<EmpresaParceira> listarTodas() { return repository.findAll(); }
}