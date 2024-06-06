package com.dreamers.api.dtos.requests;
//
//import jakarta.validation.constraints.NotBlank;
//
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
//
//
///**
// * DTO que representa la información necesaria para registrar un nuevo usuario
// * en el sistema.
// */
//public class RegistroRequest {
//
//

//	
//	@NotBlank(message = "El nombre no puede estar vacío") // Asegura que el nombre no sea null o esté vacío
//	@Size(min = 1, max = 25, message = "Un mínimo de 1 y máximo de 25 caracteres") // Limita la longitud del nombre
//	private String nombre;
//
//	@NotBlank(message = "Los apellidos no puede estar vacío") // Asegura que no sea null o esté vacío
//	@Size(min = 1, max = 35, message = "Un mínimo de 1 y máximo de 25 caracteres") // Limita la longitud
//	private String apellidos;
//
//	@NotNull(message = "El telefono no puede estar vacío") // Asegura que no sea null o esté vacío
//	private Integer telefono;
//
//	@NotBlank(message = "La direccion no puede estar vacío") // Asegura que no sea null o esté vacío
//	private String direccion;
//
//	@NotBlank(message = "El email no puede estar vacío") // Asegura que no sea null o esté vacío
//	private String email;
//
//	@NotBlank(message = "La contraseña no puede estar vacío") // Asegura que no sea null o esté vacío
//	private String password;
//
//	public RegistroRequest() {
//	}
//
//	public RegistroRequest(
//			  /**
//	         * Constructor que toma el nombre, apellidos, correo electrónico y contraseña de la solicitud.
//	         *
//	         * @param nombre
//	         * @param apellidos
//	         * @param email
//	         * @param password
//	         */
//			//@NotBlank(message = "El dni no puede estar vacío") @Size(min = 1, max = 9, message = "Un mínimo de 1 y máximo de 9 caracteres") String dni,
//			@NotBlank(message = "El nombre no puede estar vacío") @Size(min = 1, max = 25, message = "Un mínimo de 1 y máximo de 25 caracteres") String nombre,
//			@NotBlank(message = "Los apellidos no puede estar vacío") @Size(min = 1, max = 35, message = "Un mínimo de 1 y máximo de 25 caracteres") String apellidos,
//			@NotNull(message = "El telefono no puede estar vacío") Integer telefono,
//			@NotBlank(message = "La direccion no puede estar vacío") String direccion,
//			@NotBlank(message = "El email no puede estar vacío") String email,
//			@NotBlank(message = "La contraseña no puede estar vacío") String password) {
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//		this.telefono = telefono;
//		this.direccion = direccion;
//		this.email = email;
//		this.password = password;
//	}
//
//	
//	public String getNombre() {
//        return nombre;
//    }
//
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//	
//	public String getApellidos() {
//		return apellidos;
//	}
//	
//	public void setApellidos(String apellidos) {
//		this.apellidos = apellidos;
//	}
//	
//	public Integer getTelefono() {
//		return telefono;
//	}
//	
//	public void setTelefono(Integer telefono) {
//		this.telefono = telefono;
//	}
//	
//	public String getDireccion() {
//		return direccion;
//	}
//	
//	public void setDireccion(String direccion) {
//		this.direccion = direccion;
//	}
//	
//	public String getEmail() {
//		return email;
//	}
//	
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//	public String getPassword() {
//		return password;
//	}
//	
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getUsername() {
//		return email;
//	}
//	
//	
//	
//	
//}

public class RegistroRequest {
    private String nombre;
    private String apellidos;
    private String email;
    private Integer telefono;
    private String direccion;
    private String password;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}
	
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
