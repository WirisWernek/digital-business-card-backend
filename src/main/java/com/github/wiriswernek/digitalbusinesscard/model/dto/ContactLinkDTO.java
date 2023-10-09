package com.github.wiriswernek.digitalbusinesscard.model.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactLinkDTO {

	private Long id;
	private String whatsapp;
	private String email;
	private String telefone;
	private String download;

	@JsonIgnoreProperties(value = { "contactLinks" }, allowSetters = true)
	private UserDTO usuario;

	private Long idOrganizacao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataExclusao;
	private LocalDateTime dataModificacao;
}
