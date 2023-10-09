package com.github.wiriswernek.digitalbusinesscard.model.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OptionalButtonStyleDTO {
	private Long id;

	@JsonIgnoreProperties(value = { "optionalButtonStyles" }, allowSetters = true)
	private OptionalButtonDTO optionalButton;

	@JsonIgnoreProperties(value = { "optionalButtonStyles" }, allowSetters = true)
	private StyleDTO style;

	private Long idOrganizacao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataExclusao;
	private LocalDateTime dataModificacao;
}
