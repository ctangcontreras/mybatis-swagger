package com.prueba.demo.controller;

import java.util.List;

import com.prueba.demo.core.model.Producto;
import com.prueba.demo.core.model.Sucursal;
import com.prueba.demo.core.model.Usuario;
import com.prueba.demo.dto.UsuarioListaSucursal;
import com.prueba.demo.dto.UsuarioSucursal;
import com.prueba.demo.service.DemoService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/demo")
@Api(value = "HelloWorld Resource", description = "shows hello world")
public class DemoController {

	private static final Logger log = LoggerFactory.getLogger(DemoController.class);

	@Autowired
	private DemoService demoService;
	
	@ApiOperation(value = "Returns Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Hello World")
            }
    )	
	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
	public HttpEntity<String> findAlls() {
		return ResponseEntity.ok("hola");
	}
 
	@ApiOperation(value = "Returns Hello World")
	@RequestMapping(value = "/listarProducto", method = RequestMethod.GET)
	public ResponseEntity<Object> listarProducto() {
		
		try {
			return ResponseEntity.ok(demoService.getListaProducto());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "listar sucursal")
	@RequestMapping(value = "/getListaSucursal", method = RequestMethod.GET)
	public ResponseEntity<Object> listarSucursal() {
		
		try {
			return ResponseEntity.ok(demoService.getListaSucursal());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "listar usuario")
	@RequestMapping(value = "/getListaUsuario", method = RequestMethod.GET)
	public ResponseEntity<Object> listarUsuario() {
		
		try {
			return ResponseEntity.ok(demoService.getListaUsuario());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}


	@ApiOperation(value = "RegistrarUsuario ")
	@RequestMapping(value = "/getRegistrarUsuario", method = RequestMethod.POST)
	public ResponseEntity<Object> getRegistrarUsuario(@RequestBody Usuario usuario) {
		
		try {
			return ResponseEntity.ok(demoService.registrarUsuario(usuario));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}


	@ApiOperation(value = "RegistrarSucursal ")
	@RequestMapping(value = "/getRegistrarSucursal", method = RequestMethod.POST)
	public ResponseEntity<Object> getRegistrarSucursal(@RequestBody Sucursal sucursal) {
		
		try {
			return ResponseEntity.ok(demoService.registrarSucursal(sucursal));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}
	

	@ApiOperation(value = "RegistrarProducto ")
	@RequestMapping(value = "/getRegistrarProducto", method = RequestMethod.POST)
	public ResponseEntity<Object> getRegistrarProducto(@RequestBody Producto producto) {
		
		try {
			return ResponseEntity.ok(demoService.registrarProducto(producto));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "ActualizarProducto")
	@RequestMapping(value = "/getActualizarProducto", method = RequestMethod.POST)
	public ResponseEntity<Object> getActualizarProducto(@RequestBody Producto producto) {
		
		try {
			return ResponseEntity.ok(demoService.actualizarProducto(producto));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "ActualizarSucursal")
	@RequestMapping(value = "/getActualizarSucursal", method = RequestMethod.POST)
	public ResponseEntity<Object> getActualizarSucursal(@RequestBody Sucursal sucursal) {
		
		try {
			return ResponseEntity.ok(demoService.actualizarSucursal(sucursal));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "ActualizarUsuario")
	@RequestMapping(value = "/getActualizarUsuario", method = RequestMethod.POST)
	public ResponseEntity<Object> getActualizarUsuario(@RequestBody Usuario usuario) {
		
		try {
			return ResponseEntity.ok(demoService.actualizarUsuario(usuario));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "registrarListaUsuario")
	@RequestMapping(value = "/getRegistrarListaUsuario", method = RequestMethod.POST)
	public ResponseEntity<Object> getRegistrarListaUsuario(@RequestBody List<Usuario> listaUsuario) {
		
		try {
			return ResponseEntity.ok(demoService.registrarListaUsuario(listaUsuario));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "registrarListaProducto")
	@RequestMapping(value = "/getRegistrarListaProducto", method = RequestMethod.POST)
	public ResponseEntity<Object> getRegistrarListaProducto(@RequestBody List<Producto> listaProducto) {
		
		try {
			return ResponseEntity.ok(demoService.registrarListaProducto(listaProducto));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "registrarListaSucursal")
	@RequestMapping(value = "/getRegistrarListaSucursal", method = RequestMethod.POST)
	public ResponseEntity<Object> getRegistrarListaSucursal(@RequestBody List<Sucursal> listaSucursal) {
		
		try {
			return ResponseEntity.ok(demoService.registrarListaSucursal(listaSucursal));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "registrarUsuarioSucursal")
	@RequestMapping(value = "/getRegistrarUsuarioSucursal", method = RequestMethod.POST)
	public ResponseEntity<Object> getRegistrarUsuarioSucursal(@RequestBody UsuarioSucursal usuarioSucursal) {
		
		try {
			return ResponseEntity.ok(demoService.registrarUsuarioSucursal(usuarioSucursal));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}

	@ApiOperation(value = "registrarUsuarioListaSucursal")
	@RequestMapping(value = "/getRegistrarUsuarioListaSucursal", method = RequestMethod.POST)
	public ResponseEntity<Object> getRegistrarUsuarioListaSucursal(@RequestBody UsuarioListaSucursal usuarioListaSucursal) {
		
		try {
			return ResponseEntity.ok(demoService.registrarUsuarioListaSucursal(usuarioListaSucursal));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return ResponseEntity.ok(e);
		}
	}
}
