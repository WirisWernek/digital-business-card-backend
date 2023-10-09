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
public class UserDTO {

	private Long id;
	private String username;

	@JsonIgnoreProperties( value = { "usuario" }, allowSetters = true )
	private List<ActionButtonDTO> actionsButtons;

	@JsonIgnoreProperties( value = { "usuario" }, allowSetters = true )
	private List<ContactLinkDTO> contactLinks;

	@JsonIgnoreProperties( value = { "usuario" }, allowSetters = true )
	private List<LinkDTO> links;

	@JsonIgnoreProperties( value = { "usuario" }, allowSetters = true )
	private List<OptionalButtonDTO> optionalButtons;
	
	private Long idOrganizacao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataExclusao;
	private LocalDateTime dataModificacao;
}
