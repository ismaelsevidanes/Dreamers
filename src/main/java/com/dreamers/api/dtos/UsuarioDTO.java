package com.dreamers.api.dtos;

/**
 * DTO (Data Transfer Object) representa un usuario. Se utiliza para transferir
 * información de la aplicación.
 */

public class UsuarioDTO {

	private String nombre;
	private String email;
	private String password;

	public UsuarioDTO() {
	}

	public UsuarioDTO(String nombre, String email, String password) {
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UsuarioDTO [nombre=" + nombre + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
}
