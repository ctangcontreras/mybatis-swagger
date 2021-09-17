package com.prueba.demo.service;
 

import java.util.List;

import com.prueba.demo.core.model.Producto;
import com.prueba.demo.core.model.Sucursal;
import com.prueba.demo.core.model.Usuario;
import com.prueba.demo.dto.ListaProductoListaSucursal;
import com.prueba.demo.dto.UsuarioListaSucursal;
import com.prueba.demo.dto.UsuarioSucursal;
import com.prueba.demo.support.dto.Respuesta;
 

public interface DemoService {

	Respuesta<?> getListaProducto() throws Exception;
	Respuesta<?> getListaSucursal() throws Exception;
	Respuesta<?> getListaUsuario() throws Exception;
	Respuesta<?> registrarUsuario(Usuario usuario) throws Exception;
	Respuesta<?> registrarSucursal(Sucursal sucursal) throws Exception;
	Respuesta<?> registrarProducto(Producto producto) throws Exception;
	Respuesta<?> actualizarProducto(Producto producto) throws Exception;
	Respuesta<?> actualizarSucursal(Sucursal sucursal) throws Exception;
	Respuesta<?> actualizarUsuario(Usuario usuario) throws Exception;
	Respuesta<?> registrarListaUsuario(List<Usuario>listaUsuario) throws Exception;
	Respuesta<?> registrarListaProducto(List<Producto>listaProducto) throws Exception;
	Respuesta<?> registrarListaSucursal(List<Sucursal>listaSucursal) throws Exception;
	Respuesta<?> registrarUsuarioSucursal(UsuarioSucursal usuarioSucursal) throws Exception;
	Respuesta<?> registrarUsuarioListaSucursal(UsuarioListaSucursal usuarioListaSucursal) throws Exception;
	Respuesta<?> registrarListaProductoListaSucursal(ListaProductoListaSucursal listaProductoListaSucursal) throws Exception;
	Respuesta<?> contadorUsuarios() throws Exception;
	Respuesta<?> contadorProductos() throws Exception;
}
