package com.prueba.demo.mapper;

import java.util.List;

import com.prueba.demo.core.model.Vehiculo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VehiculoMapper {
    
   
    
      List<Vehiculo>  getListaVehiculo();
      
    




}
