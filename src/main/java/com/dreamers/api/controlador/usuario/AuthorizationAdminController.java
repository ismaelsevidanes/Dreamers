package com.dreamers.api.controlador.usuario;

import java.util.List;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamers.api.dtos.UsuarioDTO;
import com.dreamers.api.servicios.UsuarioService;


@RestController
@RequestMapping("/api/v1/users")
public class AuthorizationAdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AuthorizationAdminController.class);

   @Autowired
	private UsuarioService usuarioService;


    @GetMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity<List<UsuarioDTO>> showUsers() {
    	logger.info("## AuthorizationAdminController :: showUsers" );
        List<UsuarioDTO> userList = usuarioService.obtenerTodos();
        return ResponseEntity.ok(userList);
    }
}