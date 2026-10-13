package br.com.fiap.esgenergia_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "iniciativas_comunitarias")
public class IniciativaComunitaria {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private String status;

    public IniciativaComunitaria() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}