package com.dreamers.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import com.dreamers.api.entidades.Reserva;



	/**
	 * Interfaz que extiende de JpaRepository para realizar operaciones CRUD sobre
	 * la entidad Reserva.
	 */
public interface ReservaRepositorio extends JpaRepository<Reserva, Integer> {

	Optional <Reserva> findById(Long id);
	Boolean existsById(Long id);
	Optional <Reserva> deleteById(Long id);
	Optional <Reserva> findByFecha(String fecha);
//	Optional <Reserva>findbyPrecio(Long precio);
	
	Page<Reserva> findByFechaContainingIgnoreCase(String fecha, Pageable pageable);
	Page<Reserva> findByUsuarioId(Integer usuarioId, Pageable pageable);
	//Page<Reserva> findByCampoFutbolId(Integer campoFutbolId, Pageable pageable);
	
	
	
	




}

