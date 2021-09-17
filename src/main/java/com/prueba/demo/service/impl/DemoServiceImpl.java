package com.prueba.demo.service.impl;

import java.util.List;

import com.prueba.demo.core.model.Producto;
import com.prueba.demo.core.model.Sucursal;
import com.prueba.demo.core.model.Usuario;
import com.prueba.demo.dto.UsuarioSucursal;
import com.prueba.demo.mapper.ProductoMapper;
import com.prueba.demo.mapper.SucursalMapper;
import com.prueba.demo.mapper.UsuarioMapper;
import com.prueba.demo.service.DemoService;
import com.prueba.demo.support.dto.Respuesta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
 

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

	@Override
	public Respuesta<?> registrarSucursal(Sucursal sucursal) throws Exception {
		sucursalMapper.registrar(sucursal);

		return new Respuesta<>(true, null);

	}

	@Override
	public Respuesta<?> registrarProducto(Producto producto) throws Exception {
		productoMapper.registrar(producto);

		return new Respuesta<>(true, null);

	}

	@Override
	public Respuesta<?> actualizarProducto(Producto producto) throws Exception {
		productoMapper.actualizar(producto);

		return new Respuesta<>(true, null);
	}

	@Override
	public Respuesta<?> actualizarSucursal(Sucursal sucursal) throws Exception {
		sucursalMapper.actualizar(sucursal);

		return new Respuesta<>(true, null);
	}

	@Override
	public Respuesta<?> actualizarUsuario(Usuario usuario) throws Exception {
		usuarioMapper.actualizar(usuario);

		return new Respuesta<>(true, null);
	}

	@Override
	@Transactional
	public Respuesta<?> registrarListaUsuario(List<Usuario> listaUsuario) throws Exception {

		for (Usuario usuario : listaUsuario) {
			usuarioMapper.registrar(usuario);
		}
			
		return new Respuesta<>(true, null);
	}

	@Override
	@Transactional
	public Respuesta<?> registrarListaProducto(List<Producto> listaProducto) throws Exception {

		for (Producto producto : listaProducto) {
			productoMapper.registrar(producto);
		}
			
		return new Respuesta<>(true, null);
	}

	@Override
	@Transactional
	public Respuesta<?> registrarListaSucursal(List<Sucursal> listaSucursal) throws Exception {

		for (Sucursal sucursal : listaSucursal) {
			sucursalMapper.registrar(sucursal);
		}
			
		return new Respuesta<>(true, null);
	}

	@Override
	public Respuesta<?> registrarUsuarioSucursal(UsuarioSucursal usuarioSucursal) throws Exception {
		usuarioMapper.registrar(usuarioSucursal.getUsuario());
		sucursalMapper.registrar(usuarioSucursal.getSucursal());

		return new Respuesta<>(true, null);

	}
}