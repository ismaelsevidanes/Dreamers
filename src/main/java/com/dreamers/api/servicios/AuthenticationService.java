//package com.dreamers.api.servicios;
//
//import org.springframework.stereotype.Service;
//
//import com.dreamers.api.dtos.requests.LoginRequest;
//import com.dreamers.api.dtos.requests.RegistroRequest;
//import com.dreamers.api.dtos.responses.JwtAuthenticationResponse;
//
///**
// * Servicio que gestiona la autenticación de usuarios en la aplicación.
// */
//@Service
//public interface AuthenticationService {
//
//	/**
//	 * Registra un nuevo usuario en el sistema.
//	 *
//	 * @param request La información del usuario a registrar.
//	 * @return La respuesta de autenticación JWT.
//	 */
//	public JwtAuthenticationResponse signup(RegistroRequest request);
//
//	/**
//	 * Inicia sesión para un usuario existente en el sistema.
//	 *
//	 * @param request La información de inicio de sesión del usuario.
//	 * @return La respuesta de autenticación JWT.
//	 */
//	public JwtAuthenticationResponse signin(LoginRequest request);
//
//	/**
//	 * Genera un token JWT para el usuario especificado.
//	 *
//	 * @param username El nombre de usuario para el que se genera el token.
//	 * @return El token JWT generado.
//	 */
//	public String generateJwtToken(String username);
//	
//	/**
//	 * Valida un token JWT para el usuario especificado.
//	 *
//	 * @param token    El token JWT a validar.
//	 * @param username El nombre de usuario para el que se valida el token.
//	 * @return true si el token es válido, false en caso contrario.
//	 */
//	
//	public boolean validateJwtToken(String token, String username);
//	
//	/**
//	 * Extrae el nombre de usuario del token JWT especificado.
//	 *
//	 * @param token El token JWT del que se extrae el nombre de usuario.
//	 * @return El nombre de usuario extraído del token.
//	 */
//	    public String extractUsername(String token);
//
//	
//	
//}
