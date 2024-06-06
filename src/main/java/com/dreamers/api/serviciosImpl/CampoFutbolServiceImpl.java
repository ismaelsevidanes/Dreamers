package com.dreamers.api.serviciosImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamers.api.entidades.CampoFutbol;
import com.dreamers.api.repositorios.CampoFutbolRepositorio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class CampoFutbolServiceImpl {
	
	@Autowired
	private CampoFutbolRepositorio campoFutbolRepositorio;

	public CampoFutbol agregarCampoFutbol(CampoFutbol campoFutbol) {
		return campoFutbolRepositorio.save(campoFutbol);
	}

	public CampoFutbol obtenerCampoFutbolPorId(Long id) {
		return campoFutbolRepositorio.findById(id).orElse(null);
	}

	public CampoFutbol actualizarCampoFutbol(Long id, CampoFutbol detallesCampoFutbol) {
		CampoFutbol campoFutbol = obtenerCampoFutbolPorId(id);
		campoFutbol.setNombre(detallesCampoFutbol.getNombre());
		campoFutbol.setDireccion(detallesCampoFutbol.getDireccion());
		campoFutbol.setDescripcion(detallesCampoFutbol.getDescripcion());
		campoFutbol.setCapacidad(detallesCampoFutbol.getCapacidad());
		campoFutbol.setPrecio(detallesCampoFutbol.getPrecio());
		campoFutbol.setTipoCampo(detallesCampoFutbol.getTipoCampo());
		return campoFutbolRepositorio.save(campoFutbol);
	}

	public void eliminarCampoFutbol(Long id) {
		campoFutbolRepositorio.deleteById(id);
	}

	public Optional<CampoFutbol> obtenerCampoFutbolPorNombre(String nombre) {
		return campoFutbolRepositorio.findByNombre(nombre);
	}

	public Optional<CampoFutbol> obtenerCampoFutbolPorPrecio(Integer precio) {
		return campoFutbolRepositorio.findByPrecio(precio);
	}
	
	
	public Boolean existeCampoFutbolPorNombre(String nombre) {
		return campoFutbolRepositorio.existsByNombre(nombre);
	}
	
	public Boolean existeCampoFutbolPorId(Long id) {
		return campoFutbolRepositorio.existsById(id);
	}
	
	
	public Page<CampoFutbol> obtenerCampoFutbolPorNombreContainingIgnoreCase(String nombre, Pageable pageable) {
		return campoFutbolRepositorio.findByNombreContainingIgnoreCase(nombre, pageable);
	}
	
	public Page<CampoFutbol> listarTodosLosCamposFutbol(Pageable pageable) {
		return campoFutbolRepositorio.findAll(pageable);
	}


}
