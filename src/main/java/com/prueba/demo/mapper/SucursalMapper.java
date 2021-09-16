package com.prueba.demo.mapper;

import java.util.List;

import com.prueba.demo.core.model.Sucursal;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SucursalMapper {

	List<Sucursal> getListaSucursal();

}

