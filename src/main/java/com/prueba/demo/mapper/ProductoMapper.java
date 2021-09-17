package com.prueba.demo.mapper;

import java.util.List;

import com.prueba.demo.core.model.Producto;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductoMapper {

	List<Producto> getListaProducto();
	void registrar (@Param("param") Producto producto); 
	void actualizar (@Param("param") Producto producto); 
}
