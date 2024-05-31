package com.dreamers.api.repositorios;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


import com.dreamers.api.entidades.CampoFutbol;

public interface CampoFutbolRepositorio extends JpaRepository<CampoFutbol, Integer> {
	CampoFutbol findByNombre(String nombre);
	Boolean existsByNombre(String nombre);
	CampoFutbol findById(Long id);
	Boolean existsById(Long id);
	
	Page<CampoFutbol> findByNombreContainingIgnoreCase(String nombre, Pageable pageable);
	Page<CampoFutbol> findByPrecio(Integer precio, Pageable pageable);
	CampoFutbol deleteById(Long id);
	
	
	
	
	
	

}
