package com.prueba.demo.dto;

public class UsuarioSucursalDto {

private UsuarioDto usuarioDto;
private SucursalDto sucursalDto;


    public UsuarioDto getUsuarioDto() {
    return usuarioDto;
}

public void setUsuarioDto(UsuarioDto usuarioDto) {
    this.usuarioDto = usuarioDto;
}

public SucursalDto getSucursalDto() {
    return sucursalDto;
}

public void setSucursalDto(SucursalDto sucursalDto) {
    this.sucursalDto = sucursalDto;
}

    public static class UsuarioDto{

        private Integer codUsuario;
        private String nombre;
        private String user;
        private String password;
        private Integer codSucursal;

        public Integer getCodUsuario() {
            return codUsuario;
        }
        public void setCodUsuario(Integer codUsuario) {
            this.codUsuario = codUsuario;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getUser() {
            return user;
        }
        public void setUser(String user) {
            this.user = user;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public Integer getCodSucursal() {
            return codSucursal;
        }
        public void setCodSucursal(Integer codSucursal) {
            this.codSucursal = codSucursal;
        }
        
    }

    public static class SucursalDto{
        
        private Integer codSucursal;
        private String nombre;
        public Integer getCodSucursal() {
            return codSucursal;
        }
        public void setCodSucursal(Integer codSucursal) {
            this.codSucursal = codSucursal;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
    
    
}
