package com.dreamers.api.serviciosImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dreamers.api.dtos.requests.LoginRequest;
import com.dreamers.api.dtos.requests.RegistroRequest;
import com.dreamers.api.dtos.responses.JwtAuthenticationResponse;
import com.dreamers.api.servicios.AuthenticationService;


import com.dreamers.api.entidades.Role;
import com.dreamers.api.entidades.Usuario;
import com.dreamers.api.repositorios.UsuarioRepositorio;
import com.dreamers.api.servicios.JwtService;


import java.util.Optional;
import lombok.Builder;



/**
 * Implementación del servicio de autenticación que proporciona funcionalidades
 * para registro y login de usuarios.
 */
@Builder
@Service
public class AuthenticationServiceImpl implements AuthenticationService {
	
	@Autowired
    private UsuarioRepositorio usuarioRepositorio;
    private PasswordEncoder passwordEncoder;
    private AuthenticationManager authenticationManager;
    private JwtService jwtService;


    
	public JwtAuthenticationResponse signin(LoginRequest request) {
	    Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        Optional<Usuario> optionalUser = usuarioRepositorio.findByEmail(request.getEmail());

        Usuario usuario = optionalUser.orElseThrow(() -> new IllegalArgumentException("Email o contraseña inválidos."));
        
        String jwt = jwtService.generateToken(usuario);
        return JwtAuthenticationResponse.builder().token(jwt).build();
	}

	/**
	 * Registra a un nuevo usuario en el sistema.
	 *
	 * @param request La información del usuario a registrar.
	 * @return La respuesta de autenticación con el token JWT.
	 */
	@Override
	public JwtAuthenticationResponse signup(RegistroRequest request) {
        Usuario usuario = new Usuario();
        usuario.setNombre(request.getNombre());
        usuario.setApellidos(request.getApellidos());
        usuario.setEmail(request.getEmail());
        usuario.setPassword(request.getPassword());
        usuario.getRoles().add(Role.ROLE_USER);
        usuarioRepositorio.save(usuario);
        String jwt = jwtService.generateToken(usuario);
        return new JwtAuthenticationResponse(jwt);   
}

	@Override
	public String generateJwtToken(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateJwtToken(String token, String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String extractUsername(String token) {
		// TODO Auto-generated method stub
		return null;
	}
}