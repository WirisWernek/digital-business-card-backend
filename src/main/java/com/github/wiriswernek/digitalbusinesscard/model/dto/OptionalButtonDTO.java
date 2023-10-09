package com.github.wiriswernek.digitalbusinesscard.model.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OptionalButtonDTO {

	private Long id;
	private boolean pixEnable;
	private boolean avaliacaoEnable;
	private boolean newsletterEnable;
	private boolean anotacaoEnable;
	private boolean emailRapidoEnable;
	private String chavePix;
	private String emailRapidoEndereco;

	@JsonIgnoreProperties(value = { "optionalButtons" }, allowSetters = true)
	private UserDTO usuario;

	@JsonIgnoreProperties(value = { "optionalButton" }, allowSetters = true)
	private List<OptionalButtonStyleDTO> optionalButtonStyles;

	private Long idOrganizacao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataExclusao;
	private LocalDateTime dataModificacao;
}
