package com.prueba.demo.service.impl;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

import com.prueba.demo.core.model.Producto;
import com.prueba.demo.mapper.ProductoMapper;
import com.prueba.demo.service.DemoService;
import com.prueba.demo.support.dto.Respuesta;
 
 

@Service
public class DemoServiceImpl implements DemoService {
	private static final Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Autowired
	private ProductoMapper productoMapper;

	 
	
	@Override
	public Respuesta<?> getListaProducto() throws Exception {
		List<Producto> lista = productoMapper.getListaProducto();
		return new Respuesta<>(true, lista);
	}
	 
	
}
