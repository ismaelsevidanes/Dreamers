package com.dreamers.api.repositorios;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


import com.dreamers.api.entidades.CampoFutbol;

public interface CampoFutbolRepositorio extends JpaRepository<CampoFutbol, Integer> {
	Optional<CampoFutbol> findByNombre(String nombre);
	Boolean existsByNombre(String nombre);
	Optional<CampoFutbol> findById(Long id);
	Boolean existsById(Long id);
	
	Page<CampoFutbol> findByNombreContainingIgnoreCase(String nombre, Pageable pageable);
	Optional<CampoFutbol> findByPrecio(Integer precio);

	Optional<CampoFutbol> deleteById(Long id);
	
	
	
	
	
	

}
