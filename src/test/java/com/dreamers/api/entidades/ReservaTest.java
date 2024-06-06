package com.dreamers.api.entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReservaTest {

	@Test
	void testReserva_Valid() {
		Reserva reserva = new Reserva();
		reserva.setFecha("2021-06-20");
		reserva.setHorainicial("10:00");
		reserva.setHorafinal("12:00");
		reserva.addCampoFutbol(new CampoFutbol());
		reserva.setUsuario(new Usuario());
		assertTrue(reserva.getFecha().equals("2021-06-20"));
		assertTrue(reserva.getHorainicial().equals("10:00"));
		assertTrue(reserva.getHorafinal().equals("12:00"));
		assertTrue(reserva.getCamposFutbol() != null);
		assertTrue(reserva.getUsuario() != null);
	}

	@Test
	void testReserva_InvalidFecha() {
		Reserva reserva = new Reserva();
		reserva.setFecha("2021-06-20");
		reserva.setHorainicial("10:00");
		reserva.setHorafinal("12:00");
		reserva.addCampoFutbol(new CampoFutbol());
		reserva.setUsuario(new Usuario());
		assertFalse(reserva.getFecha().equals("2021-06-21"));
	}

	@Test
	void testReserva_InvalidHora() {
		Reserva reserva = new Reserva();
		reserva.setFecha("2021-06-20");
		reserva.setHorainicial("10:00");
		reserva.setHorafinal("12:00");
		reserva.addCampoFutbol(new CampoFutbol());
		reserva.setUsuario(new Usuario());
		assertFalse(reserva.getHorainicial().equals("11:00"));
	}

	@Test
	void testReserva_InvalidCampoFutbol() {
		Reserva reserva = new Reserva();
		reserva.setFecha("2021-06-20");
		reserva.setHorainicial("10:00");
		reserva.setHorafinal("12:00");
		reserva.addCampoFutbol(new CampoFutbol());
		reserva.setUsuario(new Usuario());
		assertFalse(reserva.getCamposFutbol() == null);
	}

	@Test
	void testReserva_InvalidUsuario() {
		Reserva reserva = new Reserva();
		reserva.setFecha("2021-06-20");
		reserva.setHorainicial("10:00");
		reserva.setHorafinal("12:00");
		reserva.addCampoFutbol(new CampoFutbol());
		reserva.setUsuario(new Usuario());
		assertFalse(reserva.getUsuario() == null);
	}
	
	
	 /**
     * Prueba para el método toString de Reserva.
     */
	    @Test
        void testReserva_ToString() {
    	        Reserva reserva = new Reserva();
    	        reserva.setFecha("2021-06-20");
    	        reserva.setHorainicial("10:00");
    	        reserva.setHorafinal("12:00");
    	        reserva.addCampoFutbol(new CampoFutbol());
    	        reserva.setUsuario(new Usuario());
    	        String expected = "Reserva [id=" + reserva.getId() + ", fecha=" + reserva.getFecha() + ", horainicial=" + reserva.getHorainicial() + ", horafinal=" + reserva.getHorafinal() + ", precio=" + reserva.getPrecio() + ", usuario=" + reserva.getUsuario() + ", camposFutbol=" + reserva.getCamposFutbol() + "]";
    	        assertEquals(expected, reserva.toString());
	    }
	    
	 
	    /**
		 * Prueba para el método equals de Reserva.
		 */
	    
	    @Test
	    void testReserva_Equals() {
	    	     Reserva reserva = new Reserva();
	    	     reserva.setFecha("2021-06-20");
	    	     reserva.setHorainicial("10:00");
	    	     reserva.setHorafinal("12:00");
	    	     reserva.addCampoFutbol(new CampoFutbol());
	    	     reserva.setUsuario(new Usuario());
	    	     
	    	     Reserva reserva2 = new Reserva();
	    	     reserva2.setFecha("2021-06-20");
	    	     reserva2.setHorainicial("10:00");
	    	     reserva2.setHorafinal("12:00");
	    	     reserva2.addCampoFutbol(new CampoFutbol());
	    	     reserva2.setUsuario(new Usuario());
	    	     
	    	     assertTrue(reserva.equals(reserva2));

	    }
	
	
	

}
