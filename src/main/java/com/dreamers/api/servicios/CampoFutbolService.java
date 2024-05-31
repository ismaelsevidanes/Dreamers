package com.dreamers.api.servicios;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.stereotype.Service;

import com.dreamers.api.entidades.CampoFutbol;


/**
 * Servicio que proporciona funcionalidades para gestionar campos de fútbol.
 */
@Service
public interface CampoFutbolService {
	
	/**
	 * Devuelve una lista de todos los campos de fútbol registrados en el sistema.
	 *
	 * @return Lista de campos de fútbol.
	 */
	Page<CampoFutbol> getAllCamposFutbol(Pageable pageable);

	/**
	 * Devuelve un campo de fútbol por su identificador.
	 *
	 * @param id Identificador del campo de fútbol.
	 * @return Campo de fútbol correspondiente al identificador.
	 */
	CampoFutbol getrCampoFutbolById(Long id);

	/**
	 * Registra un nuevo campo de fútbol en el sistema.
	 *
	 * @param request Datos del campo de fútbol a registrar.
	 * @return Campo de fútbol registrado.
	 */
	CampoFutbol saveCampoFutbol();

	/**
	 * Actualiza los datos de un campo de fútbol existente en el sistema.
	 *
	 * @param id      Identificador del campo de fútbol a actualizar.
	 * @param request Datos actualizados del campo de fútbol.
	 * @return Campo de fútbol actualizado.
	 */
	CampoFutbol updateCampoFutbol(Long id);

	/**
	 * Elimina un campo de fútbol del sistema.
	 *
	 * @param id Identificador del campo de fútbol a eliminar.
	 */
	//void eliminarCampoFutbol(Long id);
	 Boolean deleteCampoFutbol(Long id);
	
	/**
	 * Filtra los campos de fútbol registrados en el sistema.
	 *
	 * @param nombre Nombre del campo de fútbol.
	 * @return Lista de campos de fútbol filtrados.
	 */
	
	Page<CampoFutbol> filtrarCamposFutbolPorNombre(String nombre, Pageable pageable);
	
	/**
	 * Filtra los campos de fútbol registrados en el sistema.
	 *
	 * @param precio Precio del campo de fútbol.
	 * @return Lista de campos de fútbol filtrados.
	 */
	Page<CampoFutbol> filtrarCamposFutbolPorPrecio(String precio, Pageable pageable);
	
	
	
}
