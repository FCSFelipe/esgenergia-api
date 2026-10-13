package br.com.fiap.esgenergia_api.repository;

import br.com.fiap.esgenergia_api.model.DispositivoIot;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispositivoIotRepository extends MongoRepository<DispositivoIot, String> {}