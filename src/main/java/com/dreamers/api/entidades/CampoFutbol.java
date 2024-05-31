package com.dreamers.api.entidades;

import java.util.HashSet;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "campos_futbol")
public class CampoFutbol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "El nombre no puede estar vacío") // Asegura que el nombre no sea null o esté vacío
	@Size(min = 1, max = 25, message = "Un mínimo de 1 y máximo de 25 caracteres") // Limita la longitud del nombre
	private String nombre;

	@NotBlank(message = "La descripcion no puede estar vacío") // Asegura que no sea null o esté vacío
	@Size(min = 1, max = 50, message = "Un mínimo de 1 y máximo de 50 caracteres")
	private String descripcion;

	@NotBlank(message = "La direccion no puede estar vacío") // Asegura que no sea null o esté vacío
	@Size(min = 1, max = 50, message = "Un mínimo de 1 y máximo de 50 caracteres")
	private String direccion;

	@NotNull(message = "El precio no puede estar vacío") // Asegura que no sea null o esté vacío
	private Integer precio;

	@NotNull(message = "La capacidad no puede estar vacío") // Asegura que no sea null o esté vacío
	private Integer capacidad;

	@NotNull(message = "El tipo de campo no puede estar vacío") // Asegura que no sea null o esté vacío
	private String TipoCampo;

	//Incluir un campo denominado localidad/ciudad
	
// Incluir enumerador a futuro para indicar si es futbol 7, 11, etc.
//	@Enumerated(EnumType.STRING)
//	@Column(length = 20)
//	private TipoCampo TipoCampo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Reserva> reservas = new HashSet<>();

	public Long getId() {
		return id;

	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getPrecio() {
		return precio;
	}
	
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	public Integer getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	
	public String getTipoCampo() {
		return TipoCampo;
	}
	
	public void setTipoCampo(String TipoCampo) {
		this.TipoCampo = TipoCampo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Set<Reserva> getReservas() {
		return reservas;
	}
	
	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public boolean agregarReserva(Reserva reserva) {
		return reservas.add(reserva);
	}
	
	public boolean eliminarReserva(Reserva reserva) {
		return reservas.remove(reserva);
	}
	
	@Override
	public String toString() {
		return "CampoFutbol [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", direccion="
				+ direccion + ", precio=" + precio + ", capacidad=" + capacidad + ", TipoCampo=" + TipoCampo
				+ ", usuario=" + usuario + ", reservas=" + reservas + "]";
	}
	
	

}
