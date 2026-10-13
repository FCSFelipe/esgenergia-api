package br.com.fiap.esgenergia_api.controller;


import br.com.fiap.esgenergia_api.model.AlertaMeta;
import br.com.fiap.esgenergia_api.repository.AlertaMetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alertas")
public class AlertaMetaController {
    @Autowired
    private AlertaMetaRepository repository;

    @GetMapping
    public List<AlertaMeta> listarTodos() { return repository.findAll(); }
}