package com.prueba.demo.service.impl;

import java.util.List;

import com.prueba.demo.core.model.Producto;
import com.prueba.demo.core.model.Sucursal;
import com.prueba.demo.core.model.Usuario;
import com.prueba.demo.mapper.ProductoMapper;
import com.prueba.demo.mapper.SucursalMapper;
import com.prueba.demo.mapper.UsuarioMapper;
import com.prueba.demo.service.DemoService;
import com.prueba.demo.support.dto.Respuesta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 

@Service
public class DemoServiceImpl implements DemoService {
	private static final Logger log = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Autowired
	private ProductoMapper productoMapper;

	@Autowired
	private SucursalMapper sucursalMapper;

	@Autowired
	private UsuarioMapper usuarioMapper; 
	
	@Override
	public Respuesta<?> getListaProducto() throws Exception {
		List<Producto> lista = productoMapper.getListaProducto();
		return new Respuesta<>(true, lista);
	}
	 
	@Override
	public Respuesta<?> getListaSucursal() throws Exception {
		List<Sucursal> lista = sucursalMapper.getListaSucursal();
		return new Respuesta<>(true, lista);
	}
	
	@Override
	public Respuesta<?> getListaUsuario() throws Exception {
		List<Usuario> lista = usuarioMapper.getListaUsuario();
		return new Respuesta<>(true, lista);
	}

	@Override
	public Respuesta<?> registrarUsuario(Usuario usuario) throws Exception {
		usuarioMapper.registrar(usuario);

		return new Respuesta<>(true, null);

	}
}
