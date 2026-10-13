package br.com.fiap.esgenergia_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

@Document(collection = "leituras_consumo")
public class LeituraConsumo {
    @Id
    private String id;
    @Field("id_dispositivo")
    private String idDispositivo;
    private String metrica;
    @Field("data_hora_leitura")
    private Date dataHoraLeitura;

    public LeituraConsumo() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getIdDispositivo() { return idDispositivo; }
    public void setIdDispositivo(String idDispositivo) { this.idDispositivo = idDispositivo; }
    public String getMetrica() { return metrica; }
    public void setMetrica(String metrica) { this.metrica = metrica; }
    public Date getDataHoraLeitura() { return dataHoraLeitura; }
    public void setDataHoraLeitura(Date dataHoraLeitura) { this.dataHoraLeitura = dataHoraLeitura; }
}