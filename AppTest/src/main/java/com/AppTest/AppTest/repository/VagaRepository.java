package com.AppTest.AppTest.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.AppTest.AppTest.models.Vaga;

@SuppressWarnings("unused")
public interface VagaRepository extends CrudRepository<Vaga, String> {
	Vaga findByCodigo(long codigo);
	List<Vaga>findByNome(String nome);
}
