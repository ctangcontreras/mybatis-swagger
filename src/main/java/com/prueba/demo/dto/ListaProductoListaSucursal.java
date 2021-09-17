package com.prueba.demo.dto;

import java.util.List;

import com.prueba.demo.core.model.Producto;
import com.prueba.demo.core.model.Sucursal;

public class ListaProductoListaSucursal {

    private List<Producto> listaProducto;
    private List<Sucursal> listaSucursal;
    
    public List<Producto> getListaProducto() {
        return listaProducto;
    }
    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    public List<Sucursal> getListaSucursal() {
        return listaSucursal;
    }
    public void setListaSucursal(List<Sucursal> listaSucursal) {
        this.listaSucursal = listaSucursal;
    }
    
     
}
