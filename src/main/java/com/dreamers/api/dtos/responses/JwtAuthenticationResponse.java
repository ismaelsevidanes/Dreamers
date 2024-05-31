package com.dreamers.api.dtos.responses;

import com.dreamers.api.dtos.responses.JwtAuthenticationResponse;

/**
 * DTO (Data Transfer Object) representa una respuesta de autenticación JWT. Se
 * utiliza para transferir información de la aplicación.
 */
public class JwtAuthenticationResponse {
	//Esta clase es diferente al realizado en las API plantas
	
	private String accessToken;
	private String tokenType = "Bearer";
	
	public JwtAuthenticationResponse(String accessToken) {
		this.accessToken = accessToken;
	}
	
	/**
	 * Obtiene el token de acceso.
	 *
	 * @return El token de acceso.
	 */
	public String getAccessToken() {
		return accessToken;
	}
	
	/**
	 * Obtiene el tipo de token.
	 *
	 * @return El tipo de token.
	 */
	public String getTokenType() {
		return tokenType;
	}
	
	/**
	 * Establece el token de acceso.
	 *
	 * @param accessToken El token de acceso.
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
		
	}
	
	/**
	 * Establece el tipo de token.
	 *
	 * @param tokenType El tipo de token.
	 */
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	
	/**
	 * Creador de instancias para construir objetos JwtAuthenticationResponse de
	 * manera fluida.
	 *
	 * @return Instancia de JwtAuthenticationResponseBuilder para construir objetos
	 *         JwtAuthenticationResponse.
	 */
	public static JwtAuthenticationResponseBuilder builder() {
        return new JwtAuthenticationResponseBuilder();
    }
	/**
	 * Clase interna que actúa como constructor de JwtAuthenticationResponse para
	 * construcción fluida.
	 */
    public static class JwtAuthenticationResponseBuilder {
        private String token;

        private JwtAuthenticationResponseBuilder() {
        }

		/**
		 * Establece el token JWT.
		 *
		 * @param token El token JWT.
		 * @return El constructor para continuar con la construcción fluida.
		 */
        public JwtAuthenticationResponseBuilder token(String token) {
            this.token = token;
            return this;
        }

       /**
       * Construye un objeto JwtAuthenticationResponse con los valores establecidos.
       * @return Un objeto JwtAuthenticationResponse.
       */
        public JwtAuthenticationResponse build() {
            return new JwtAuthenticationResponse(token);
        }
    }
	
	
	@Override
	public String toString() {
		return "JwtAuthenticationResponse [accessToken=" + accessToken + ", tokenType=" + tokenType + "]";
	}
	
	
	

}
