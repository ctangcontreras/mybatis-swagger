package com.prueba.demo.dto;

import java.util.List;

import com.prueba.demo.core.model.Sucursal;
import com.prueba.demo.core.model.Usuario;

public class UsuarioListaSucursal {
    
    private Usuario usuario;
    private List<Sucursal> listaSucursal;

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<Sucursal> getListaSucursal() {
        return listaSucursal;
    }
    public void setListaSucursal(List<Sucursal> listaSucursal) {
        this.listaSucursal = listaSucursal;
    }

    

    

}
