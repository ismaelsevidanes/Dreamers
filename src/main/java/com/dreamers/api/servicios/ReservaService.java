package com.dreamers.api.servicios;

import org.springframework.stereotype.Service;

import com.dreamers.api.entidades.Reserva;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Service
public interface ReservaService {

	Page<Reserva> getAllReservas(Pageable pageable);

	Optional<Reserva> getReservaById(Long id);

	Reserva saveReserva(Reserva reserva);

	Reserva updateReserva(Long id, Reserva reserva);

	Boolean deleteReserva(Long id);

	Optional<Reserva> filtrarreservasporfecha(String fecha);
	
//	Optional<Reserva> filtrarreservasporprecio(Long precio);
	
	

	
}
