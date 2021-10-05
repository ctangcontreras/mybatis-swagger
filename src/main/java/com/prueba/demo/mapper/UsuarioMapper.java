package com.prueba.demo.mapper;

import java.util.List;

import com.prueba.demo.core.model.Usuario;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsuarioMapper {
  List<Usuario>  getListaUsuario();
  void registrar(@Param("param") Usuario usuario);
  void actualizar(@Param("param") Usuario usuario);
  Integer contadorUsuarios();
  Integer maximoUsuario();

}
