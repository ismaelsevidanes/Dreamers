package com.dreamers.api.entidades;


import static org.junit.jupiter.api.Assertions.*;


import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

/**
 * Clase de prueba unitaria para la clase CampoFutbol.
 */

class CampoFutbolTest {
	
	private static Validator validator;

	/**
     * Configura el validador antes de ejecutar las pruebas.
     */
	@BeforeAll
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
	
	/**
	 * Prueba para un objeto CampoFutbol válido.
	 */
	
	@Test
	    void testCampoFutbol_Valid() {
        CampoFutbol campoFutbol = new CampoFutbol();
        campoFutbol.setNombre("Campo de futbol");
        campoFutbol.setDescripcion("Campo de futbol con cesped artificial");
        campoFutbol.setDireccion("Calle asa  nº 1");
        campoFutbol.setPrecio(50);
        campoFutbol.setCapacidad(22);
        campoFutbol.setTipoCampo("Futbol 7");
        Set<ConstraintViolation<CampoFutbol>> violations = validator.validate(campoFutbol);
        assertTrue(violations.isEmpty());
        
        
	}
	
	/**
	 * Prueba para un objeto CampoFutbol con nombre inválido.
	 */
	
	@Test
	void testCampoFutbol_InvalidNombre() {
		CampoFutbol campoFutbol = new CampoFutbol();
		campoFutbol.setNombre("");
		campoFutbol.setDescripcion("Campo de futbol con cesped artificial");
		campoFutbol.setDireccion("Calle asa  nº 1");
		campoFutbol.setPrecio(50);
		campoFutbol.setCapacidad(22);
		campoFutbol.setTipoCampo("Futbol 7");
		Set<ConstraintViolation<CampoFutbol>> violations = validator.validate(campoFutbol);
		assertFalse(violations.isEmpty());
	}
	
	/**
	 * Prueba para un objeto CampoFutbol con precio inválido.
	 */
	
	@Test
	void testCampoFutbol_InvalidPrecio() {
		CampoFutbol campoFutbol = new CampoFutbol();
		campoFutbol.setNombre("Campo de futbol");
		campoFutbol.setDescripcion("Campo de futbol con cesped artificial");
		campoFutbol.setDireccion("Calle asa  nº 1");
		campoFutbol.setPrecio(-50);
		campoFutbol.setCapacidad(22);
		campoFutbol.setTipoCampo("Futbol 7");
		Set<ConstraintViolation<CampoFutbol>> violations = validator.validate(campoFutbol);
		assertFalse(violations.isEmpty());
	}
	
	/**
	 * Prueba para un objeto CampoFutbol con capacidad inválida.
	 */
	
	@Test
	void testCampoFutbol_InvalidCapacidad() {
		CampoFutbol campoFutbol = new CampoFutbol();
		campoFutbol.setNombre("Campo de futbol");
		campoFutbol.setDescripcion("Campo de futbol con cesped artificial");
		campoFutbol.setDireccion("Calle asa  nº 1");
		campoFutbol.setPrecio(50);
		campoFutbol.setCapacidad(-200);
		campoFutbol.setTipoCampo("Futbol 7");
		Set<ConstraintViolation<CampoFutbol>> violations = validator.validate(campoFutbol);
		assertFalse(violations.isEmpty());
	}
	
	/**
	 * Prueba para un objeto CampoFutbol con tipoCampo inválido.
	 */
	
	@Test
	void testCampoFutbol_InvalidTipoCampo() {
		CampoFutbol campoFutbol = new CampoFutbol();
		campoFutbol.setNombre("Campo de futbol");
		campoFutbol.setDescripcion("Campo de futbol con cesped artificial");
		campoFutbol.setDireccion("Calle asa  nº 1");
		campoFutbol.setPrecio(50);
		campoFutbol.setCapacidad(22);
		campoFutbol.setTipoCampo("");
		Set<ConstraintViolation<CampoFutbol>> violations = validator.validate(campoFutbol);
		assertFalse(violations.isEmpty());
	}
	
	/**
	 * Prueba para un objeto CampoFutbol con todos los campos inválidos.
	 */
	
	@Test
	void testCampoFutbol_AllInvalid() {
		CampoFutbol campoFutbol = new CampoFutbol();
		campoFutbol.setNombre("");
		campoFutbol.setDescripcion("");
		campoFutbol.setDireccion("");
		campoFutbol.setPrecio(-50);
		campoFutbol.setCapacidad(-22);
		campoFutbol.setTipoCampo("");
		Set<ConstraintViolation<CampoFutbol>> violations = validator.validate(campoFutbol);
		assertFalse(violations.isEmpty());
	}
	
	  /**
     * Prueba para los métodos getters y setters de CampoFutbol.
     */
    @Test
	void testCampoFutbol_GettersSetters() {
		CampoFutbol campoFutbol = new CampoFutbol();
		campoFutbol.setNombre("Campo de futbol");
		campoFutbol.setDescripcion("Campo de futbol con cesped artificial");
		campoFutbol.setDireccion("Calle asa  nº 1");
		campoFutbol.setPrecio(50);
		campoFutbol.setCapacidad(22);
		campoFutbol.setTipoCampo("Futbol 7");

		assertEquals("Campo de futbol", campoFutbol.getNombre());
		assertEquals("Campo de futbol con cesped artificial", campoFutbol.getDescripcion());
		assertEquals("Calle asa  nº 1", campoFutbol.getDireccion());
		assertEquals(50, campoFutbol.getPrecio());
		assertEquals(22, campoFutbol.getCapacidad());
		assertEquals("Futbol 7", campoFutbol.getTipoCampo());
	}
    
    /**
     * Prueba para el método toString de CampoFutbol.
     */
    @Test
        void testCampoFutbol_ToString() {
    	        CampoFutbol campoFutbol = new CampoFutbol();
    	        campoFutbol.setNombre("Campo de futbol");
    	        campoFutbol.setDescripcion("Campo de futbol con cesped artificial");
    	        campoFutbol.setDireccion("Calle asa  nº 1");
    	        campoFutbol.setPrecio(50);
    	        campoFutbol.setCapacidad(22);
    	        campoFutbol.setTipoCampo("Futbol 7");
    	        String expected = "CampoFutbol [id=" + campoFutbol.getId() + ", nombre=" + campoFutbol.getNombre() + ", descripcion=" + campoFutbol.getDescripcion() + ", direccion=" + campoFutbol.getDireccion() + ", precio=" + campoFutbol.getPrecio() + ", capacidad=" + campoFutbol.getCapacidad() + ", tipoCampo=" + campoFutbol.getTipoCampo() + "]";
    	        assertEquals(expected, campoFutbol.toString());
    	        
    }
    
	/**
	 * Prueba para el método equals de CampoFutbol.
	 */
        @Test
		void testCampoFutbol_Equals() {
			CampoFutbol campoFutbol = new CampoFutbol();
			campoFutbol.setNombre("Campo de futbol");
			campoFutbol.setDescripcion("Campo de futbol con cesped artificial");
			campoFutbol.setDireccion("Calle asa  nº 1");
			campoFutbol.setPrecio(50);
			campoFutbol.setCapacidad(22);
			campoFutbol.setTipoCampo("Futbol 7");

			CampoFutbol campoFutbol2 = new CampoFutbol();
			campoFutbol2.setNombre("Campo de futbol");
			campoFutbol2.setDescripcion("Campo de futbol con cesped artificial");
			campoFutbol2.setDireccion("Calle asa  nº 1");
			campoFutbol2.setPrecio(50);
			campoFutbol2.setCapacidad(22);
			campoFutbol2.setTipoCampo("Futbol 7");

			assertTrue(campoFutbol.equals(campoFutbol2));

		}
        
    
	
	
}
