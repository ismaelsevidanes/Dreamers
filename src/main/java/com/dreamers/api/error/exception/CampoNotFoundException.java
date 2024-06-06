package com.dreamers.api.error.exception;

public class CampoNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public CampoNotFoundException(String message) {
        super(message);
    }
}