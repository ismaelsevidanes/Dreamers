package com.dreamers.api.servicios;

import org.springframework.stereotype.Service;

import com.dreamers.api.entidades.Reserva;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Service
public interface ReservaService {

	Page<Reserva> getAllReservas(Pageable pageable);

	Reserva getReservaById(Long id);

	Reserva saveReserva(Reserva reserva);

	Reserva updateReserva(Long id, Reserva reserva);

	Boolean deleteReserva(Long id);

	Page<Reserva> filtrarReservasPorFecha(String fecha, Pageable pageable);
	
	Page<Reserva> filtrarReservasPorPrecio(Integer precio, Pageable pageable);
	
	

	
}
