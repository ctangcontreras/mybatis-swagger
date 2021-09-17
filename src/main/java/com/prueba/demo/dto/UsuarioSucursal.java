package com.prueba.demo.dto;

import com.prueba.demo.core.model.Sucursal;
import com.prueba.demo.core.model.Usuario;

public class UsuarioSucursal {

    private Usuario usuario;
    private Sucursal sucursal;

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    
}
