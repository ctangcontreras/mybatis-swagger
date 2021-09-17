package com.prueba.demo.mapper;

import java.util.List;

import com.prueba.demo.core.model.Sucursal;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SucursalMapper {

	List<Sucursal> getListaSucursal();
	void registrar (@Param("param") Sucursal sucursal); 
	void actualizar (@Param("param") Sucursal sucursal); 
}

