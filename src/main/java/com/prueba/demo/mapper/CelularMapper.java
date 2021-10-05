

package com.prueba.demo.mapper;

import java.util.List;

import com.prueba.demo.core.model.Celular;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CelularMapper{

	List<Celular> getListaCelular();
	
    
    
}