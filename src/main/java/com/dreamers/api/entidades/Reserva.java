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
@Table(name = "reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "La fecha no puede estar vacío") // Asegura que la fecha no sea null o esté vacío
	@Size(min = 1, max = 25, message = "Un mínimo de 1 y máximo de 25 caracteres") // Limita la longitud de la fecha
	private String fecha;

	// Cambiar a tipo Date a futuro
	@NotBlank(message = "La hora no puede estar vacío") // Asegura que la hora no sea null o esté vacío
	@Size(min = 1, max = 25, message = "Un mínimo de 1 y máximo de 25 caracteres") // Limita la longitud de la hora
	private String horainicial;
	
	@NotBlank(message = "La hora no puede estar vacío") // Asegura que la hora no sea null o esté vacío
	@Size(min = 1, max = 25, message = "Un mínimo de 1 y máximo de 25 caracteres") // Limita la longitud de la hora
	private String horafinal;

	@NotNull(message = "El precio no puede estar vacío") // Asegura que no sea null o esté vacío
	private Integer precio;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@ManyToMany(fetch = FetchType.LAZY)
	private Set<CampoFutbol> camposFutbol = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setHorainicial(String horainicial) {
		this.horainicial = horainicial;
	}
	
	public String getHorainicial() {
		return horainicial;
	}
	
	public void setHorafinal(String horafinal) {
		this.horafinal = horafinal;
	}
	public String getHorafinal() {
		return horafinal;
	}
	

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<CampoFutbol> getCamposFutbol() {
		return camposFutbol;
	}

	public void setCamposFutbol(Set<CampoFutbol> camposFutbol) {
		this.camposFutbol = camposFutbol;
	}
	
	public void addCampoFutbol(CampoFutbol campoFutbol) {
		this.camposFutbol.add(campoFutbol);
	}
	
	public void removeCampoFutbol(CampoFutbol campoFutbol) {
		this.camposFutbol.remove(campoFutbol);
	}
	
	
	
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", fecha=" + fecha + ", horainicial=" + horainicial + ", horafinal=" + horafinal
				+ ", precio=" + precio + ", usuario=" + usuario + ", camposFutbol=" + camposFutbol + "]";
	}
	
}
