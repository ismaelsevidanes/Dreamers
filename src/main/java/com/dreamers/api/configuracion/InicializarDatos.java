package com.dreamers.api.configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.dreamers.api.entidades.CampoFutbol;
import com.dreamers.api.entidades.Reserva;
import com.dreamers.api.entidades.Role;
import com.dreamers.api.entidades.Usuario;
import com.dreamers.api.repositorios.UsuarioRepositorio;
import com.dreamers.api.repositorios.CampoFutbolRepositorio;
import com.dreamers.api.repositorios.ReservaRepositorio;
//import com.dreamers.api.servicios.AuthenticationService;

/**
 * Clase que inicializa los datos de la aplicación.
 */
@Component

public class InicializarDatos implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	@Autowired
	private CampoFutbolRepositorio campoFutbolRepositorio;
	
	@Autowired
	private ReservaRepositorio reservaRepositorio;
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	//@Autowired
    //private AuthenticationService authenticationService;
	
	 
	@Override
    public void run(String... args) throws Exception {
		
		Usuario usuarioAdmin =null;
		Usuario usuarioUser =null;
		Usuario usuario =null;
		
		try {
		// Usuario 1
        if (usuarioRepositorio.findByEmail("ismael.sevidanes@example.com").isEmpty()) {
        usuarioAdmin = new Usuario();
        usuarioAdmin.setNombre("Ismael");
        usuarioAdmin.setApellidos("Sevidanes");
        usuarioAdmin.setDni("12345678A");
        usuarioAdmin.setDireccion("Calle Ismael");
        usuarioAdmin.setTelefono(666666666);
        usuarioAdmin.setEmail("ismael.sevidanes@example.com");
        usuarioAdmin.setPassword("admin");
        usuarioAdmin.getRoles().add(Role.ROLE_ADMIN);
        usuarioAdmin.getRoles().add(Role.ROLE_USER);
        usuarioRepositorio.save(usuarioAdmin);
	 }else {
         System.out.println("El usuario ya existe");
     }
        
    		// Usuario 2
        if (usuarioRepositorio.findByEmail("manuel.rodriguez@example.com").isEmpty()) {
        usuarioUser = new Usuario();
        usuarioUser.setNombre("Mamuel");
        usuarioUser.setApellidos("Rodriguez");
        usuarioAdmin.setDni("12345678B");
        usuarioAdmin.setDireccion("Calle Manuel");
        usuarioAdmin.setTelefono(111111111);
        usuarioUser.setEmail("manuel.rodriguez@example.com");
        usuarioUser.setPassword("user");
        usuarioUser.getRoles().add(Role.ROLE_USER);
        usuarioRepositorio.save(usuarioUser);
            }else {
                System.out.println("El usuario ya existe");
            }
        
        if (usuarioRepositorio.findByEmail("usuario@example.com").isEmpty()) {
        usuario = new Usuario();
        usuario.setNombre("usuario");
        usuario.setApellidos("usuario");
        usuarioAdmin.setDni("12345678C");
        usuarioAdmin.setDireccion("Calle User");
        usuarioAdmin.setTelefono(222222222);
        usuario.setEmail("usuario");
        usuario.setPassword("usuario");
        usuario.getRoles().add(Role.ROLE_USER);
        usuarioRepositorio.save(usuario);
        }else {
            System.out.println("El usuario ya existe");
        }
        
        
        
//        authenticationService.signup(usuarioAdmin);
//        authenticationService.signup(usuarioUser);
//        authenticationService.signup(usuario);
        
 
       //CampoFutbol1
       CampoFutbol campoFutbol1 = new CampoFutbol();
       campoFutbol1.setNombre("CampoFutbol1");
       campoFutbol1.setDescripcion("CampoFutbol1");
       campoFutbol1.setDireccion("Calle CampoFutbol1");
       campoFutbol1.setPrecio(50);
       campoFutbol1.setCapacidad(10);
       campoFutbol1.setTipoCampo("Futbol 7");
       campoFutbolRepositorio.save(campoFutbol1);
       
       //CampoFutbol2
       CampoFutbol campoFutbol2 = new CampoFutbol();
       campoFutbol2.setNombre("CampoFutbol2");
       campoFutbol2.setDescripcion("CampoFutbol2");
       campoFutbol2.setDireccion("Calle CampoFutbol2");
       campoFutbol2.setPrecio(60);
       campoFutbol2.setCapacidad(12);
       campoFutbol2.setTipoCampo("Futbol 7");
       campoFutbolRepositorio.save(campoFutbol1);
       
       //Reserva1
       Reserva reserva1 = new Reserva();
       reserva1.setFecha("2024-05-10");
       reserva1.setHorainicial("10:00");
       reserva1.setHorafinal("12:00");
       reserva1.setPrecio(10);
       reserva1.addCampoFutbol(campoFutbol1);
       reserva1.setUsuario(usuarioAdmin);
       reservaRepositorio.save(reserva1);
       
       //Reserva2
       Reserva reserva2 = new Reserva();
       reserva2.setFecha("2024-05-15");
       reserva2.setHorainicial("17:00");
       reserva2.setHorafinal("19:00");
       reserva2.setPrecio(20);
       reserva2.addCampoFutbol(campoFutbol2);
       reserva2.setUsuario(usuarioUser);
       reservaRepositorio.save(reserva2);
       	
       
 
        
        
        }catch(Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
    	}
	}
		
	
}
