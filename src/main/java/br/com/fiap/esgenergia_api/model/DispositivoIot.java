package br.com.fiap.esgenergia_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "dispositivos_iot")
public class DispositivoIot {
    @Id
    private String id;
    @Field("id_dispositivo")
    private String idDispositivo;
    private String tipo;
    private String status;

    public DispositivoIot() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getIdDispositivo() { return idDispositivo; }
    public void setIdDispositivo(String idDispositivo) { this.idDispositivo = idDispositivo; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}