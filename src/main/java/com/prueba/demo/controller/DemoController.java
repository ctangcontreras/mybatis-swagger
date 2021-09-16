package com.prueba.demo.controller;

import com.prueba.demo.core.model.Usuario;
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
	
}
