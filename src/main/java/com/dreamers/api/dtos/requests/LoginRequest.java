package com.dreamers.api.dtos.requests;

import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.Size;

/**
 * DTO que representa la información necesaria para iniciar sesión en el sistema.
 */
public class LoginRequest {

	@NotBlank(message = "El email no puede estar vacío") // Asegura que no sea null o esté vacío
	private String email;

	@NotBlank(message = "La contraseña no puede estar vacío") // Asegura que no sea null o esté vacío
	private String password;

	public LoginRequest() {
	}

	public LoginRequest(/**
						 * Constructor que toma el correo electrónico y la contraseña de la solicitud.
						 * 
						 * @param email
						 * @param password
						 */
	@NotBlank(message = "El email no puede estar vacío") @Size(min = 1, max = 50, message = "Un mínimo de 1 y máximo de 50 caracteres") String email,
			@NotBlank(message = "La contraseña no puede estar vacío") @Size(min = 1, max = 50, message = "Un mínimo de 1 y máximo de 50 caracteres") String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return email;
	}

}
