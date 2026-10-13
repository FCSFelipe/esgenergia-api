package br.com.fiap.esgenergia_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "alertas_metas")
public class AlertaMeta {
    @Id
    private String id;
    @Field("codigo_alerta")
    private String codigoAlerta;
    private String tipo;
    private String severidade;
    private String status;

    public AlertaMeta() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getCodigoAlerta() { return codigoAlerta; }
    public void setCodigoAlerta(String codigoAlerta) { this.codigoAlerta = codigoAlerta; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getSeveridade() { return severidade; }
    public void setSeveridade(String severidade) { this.severidade = severidade; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}