package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IClienteDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

@Service //decoramos como un componente de servicio
public class ClienteServiceImpl implements IClienteService {

	@Autowired //para la injeccion de ClienteDao
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true) //para tener el control y sea de forma explisita
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

}
