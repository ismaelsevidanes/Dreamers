package com.dreamers.api.controlador.usuario;

import org.springframework.beans.factory.annotation.Autowired;






import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamers.api.dtos.requests.LoginRequest;
import com.dreamers.api.dtos.requests.RegistroRequest;
import com.dreamers.api.dtos.responses.JwtAuthenticationResponse;
import com.dreamers.api.servicios.AuthenticationService;

import lombok.RequiredArgsConstructor;

//import com.dreamers.api.servicios.AuthenticationService;


/**
 * Controlador REST que gestiona las operaciones de autenticación y registro de
 * usuarios. Proporciona endpoints para registrar nuevos usuarios y para iniciar
 * sesión.
 */
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
	@Autowired
	AuthenticationService authenticationService;

	/**
	 * Registra un nuevo usuario en el sistema.
	 */
//	@PostMapping("/signup")
//	public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody RegistroRequest request) {
//		JwtAuthenticationResponse response = authenticationService.signup(request);
//		return ResponseEntity.ok(response);
//	}
	
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody RegistroRequest request) {
        return ResponseEntity.ok(authenticationService.signup(request));
    }

	/**
	 * Inicia sesión para un usuario existente en el sistema.
	 */
	@PostMapping("/signin")
	public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody LoginRequest request) {
		JwtAuthenticationResponse response = authenticationService.signin(request);
		return ResponseEntity.ok(response);
	}
	/**
	 * Cierra la sesión de un usuario.
	 */
	@PostMapping("/signout")
	public ResponseEntity<?> signout() {
		return null;
	}
	
	/**
	 * Obtiene el usuario actualmente autenticado.
	 */
	@PostMapping("/me")
	public ResponseEntity<?> me() {
		return null;
	}
	
	/**
	 * Actualiza los datos de un usuario.
	 */
	@PostMapping("/update")
	public ResponseEntity<?> update() {
		return null;
	}
	
	/**
	 * Elimina un usuario.
	 */
	@PostMapping("/delete")
	public ResponseEntity<?> delete() {
		return null;
	}
	
	/**
	 * Obtiene todos los usuarios.
	 */
	@PostMapping("/all")
	public ResponseEntity<?> all() {
		return null;
	}
	
	/**
	 * Obtiene un usuario por su id.
	 */
	@PostMapping("/id")
	public ResponseEntity<?> id() {
		return null;
	}
	
	/**
	 * Obtiene un usuario por su dni.
	 */
	@PostMapping("/dni")
	public ResponseEntity<?> dni() {
		return null;
	}


}

