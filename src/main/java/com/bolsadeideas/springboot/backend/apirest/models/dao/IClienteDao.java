package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Region;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
	@Query("from Region") // estamos trabajando con las clases y las estamos mapeando
	public List<Region> findAllRegiones();
}
