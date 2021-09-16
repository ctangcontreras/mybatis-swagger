package com.prueba.demo.service;
 

import com.prueba.demo.core.model.Usuario;
import com.prueba.demo.support.dto.Respuesta;
 

public interface DemoService {

	Respuesta<?> getListaProducto() throws Exception;
	Respuesta<?> getListaSucursal() throws Exception;
	Respuesta<?> getListaUsuario() throws Exception;
	Respuesta<?> registrarUsuario(Usuario usuario) throws Exception;
}
