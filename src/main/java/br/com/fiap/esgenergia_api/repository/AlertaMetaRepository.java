package br.com.fiap.esgenergia_api.repository;

import br.com.fiap.esgenergia_api.model.AlertaMeta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertaMetaRepository extends MongoRepository<AlertaMeta, String> {}