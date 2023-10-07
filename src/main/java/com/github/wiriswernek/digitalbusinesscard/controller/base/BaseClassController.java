package com.github.wiriswernek.digitalbusinesscard.controller.base;

import java.util.UUID;

import org.springframework.http.ResponseEntity;

import com.github.wiriswernek.digitalbusinesscard.exceptions.BusinessException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseClassController {

	private UUID uuid;
	private String message;

	protected ResponseEntity internalServerError(Exception exception) {
		this.uuid = UUID.randomUUID();
		this.message = new StringBuilder("Erro interno do Servidor contate o Administrado com o Código ").append(uuid)
				.toString();
		log.error(message, exception);
		return ResponseEntity.internalServerError().body(message);
	}

	protected ResponseEntity badRequestResponse(BusinessException businessException) {
		this.message = businessException.getMessage();
		log.error(this.message, businessException);
		return ResponseEntity.badRequest().body(message);
	}
}
