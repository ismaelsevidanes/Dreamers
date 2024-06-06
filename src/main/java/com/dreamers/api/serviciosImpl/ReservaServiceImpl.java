package com.dreamers.api.serviciosImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dreamers.api.entidades.Reserva;
import com.dreamers.api.repositorios.ReservaRepositorio;
import com.dreamers.api.servicios.ReservaService;


public class ReservaServiceImpl implements ReservaService{
	
	@Autowired
	private ReservaRepositorio ReservaRepositorio;

	@Override
	public Page<Reserva> getAllReservas(Pageable pageable) {
		return ReservaRepositorio.findAll(pageable);

	}

	@Override
	public Optional<Reserva> getReservaById(Long id) {
		return ReservaRepositorio.findById(id);

	}

	@Override
	public Reserva saveReserva(Reserva reserva) {
		return ReservaRepositorio.save(reserva);

	}

	@Override
	public Reserva updateReserva(Long id, Reserva reserva) {
		Reserva reservaActual = ReservaRepositorio.findById(id).get();
		reservaActual.setFecha(reserva.getFecha());
		reservaActual.setHorainicial(reserva.getHorainicial());
		reservaActual.setHorafinal(reserva.getHorafinal());
		reservaActual.setPrecio(reserva.getPrecio());
		reservaActual.setUsuario(reserva.getUsuario());
		reservaActual.setCamposFutbol(reserva.getCamposFutbol());
		return ReservaRepositorio.save(reservaActual);
	}

	@Override
	public Boolean deleteReserva(Long id) {
		if (ReservaRepositorio.existsById(id)) {
			ReservaRepositorio.deleteById(id);
			return true;
		}
		return null;
	}

	@Override
	public Optional<Reserva> filtrarreservasporfecha(String fecha) {
		return ReservaRepositorio.findByFecha(fecha);
	}

//	@Override
//	public Optional<Reserva> filtrarreservasporprecio(Integer precio) {
//		return ReservaRepositorio.findbyPrecio(precio);
//
//	}
	

	


	
}
