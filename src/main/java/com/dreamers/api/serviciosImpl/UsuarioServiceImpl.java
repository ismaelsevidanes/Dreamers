package com.dreamers.api.serviciosImpl;



import java.util.List;



import java.util.Optional;
import java.util.stream.Collectors;

import com.dreamers.api.dtos.UsuarioDTO;
import com.dreamers.api.entidades.Usuario;
import com.dreamers.api.repositorios.UsuarioRepositorio;
import com.dreamers.api.servicios.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

/**
 * Implementación del servicio de usuario que proporciona operaciones
 * relacionadas con usuarios.
 */
@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

	/**
	 * Inyección del repositorio de usuario.
	 */
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	/**
	 * Retorna un objeto UserDetailsService que carga los detalles de usuario por
	 * nombre de usuario.
	 *
	 * @return Un objeto UserDetailsService para cargar los detalles de usuario.
	 */
	@Override
	public UserDetailsService userDetailsService() {
		return new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String nombre) {
				return usuarioRepositorio.findByEmail(nombre)
						.orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));
			}
		};
	}

	/**
	 * Obtiene todos los usuarios y los convierte en una lista de objetos
	 * UsuarioDTO.
	 *
	 * @return Una lista de todos los usuarios convertidos en objetos UsuarioDTO.
	 */
	@Override
	public List<UsuarioDTO> obtenerTodos() {
		List<UsuarioDTO> usuarios = usuarioRepositorio.findAll().stream()
				//Aqui quizas es es necesario tambien añadir el campo password ya que en el usuarioDTO lo tengo reflejado
				.map(usuario -> new UsuarioDTO(usuario.getNombre(), usuario.getApellidos(), usuario.getEmail(),
						usuario.getRoles().toString()))
				.collect(Collectors.toList());
		return usuarios;
	}

	@Override
	public Page<Usuario> getAllUsuario(Pageable pageable) {
		return usuarioRepositorio.findAll(pageable);
	}

	@Override
	public Optional<Usuario> getUsuarioById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepositorio.findById(id);
	}

	@Override
	public Usuario saveUsuario(Usuario reserva) {
		return usuarioRepositorio.save(reserva);
	}

	@Override
	public Boolean deleteUsuario(Long id) {
		if (usuarioRepositorio.existsById(id)) {
			usuarioRepositorio.deleteById(id);
			return true;
		}
		return null;
	}

	@Override
	public Usuario updateUsuario(Long id, Usuario reserva) {
		Optional<Usuario> reservaById = usuarioRepositorio.findById(id);
		
		if (reservaById.isPresent()) {
			Usuario updateReserva = reservaById.get();

			updateReserva.setId(reserva.getId());
			updateReserva.setNombre(reserva.getNombre());
			updateReserva.setApellidos(reserva.getApellidos());
			updateReserva.setEmail(reserva.getEmail());
			updateReserva.setRoles(reserva.getRoles());
			return usuarioRepositorio.save(updateReserva);
		}
		return null;
	}

	@Override
	public Page<Usuario> filtrarUsuario(String nombre, Pageable pageable) {
		return usuarioRepositorio.findByNombreContainingIgnoreCase(nombre, pageable);
	}


}