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
public class ActionButtonDTO {

	private Long id;
	private String link;
	private String icon;
	private String descricao;
	private String styleNameId;

	@JsonIgnoreProperties( value = { "actionsButtons" }, allowSetters = true )
	private UserDTO usuario;

	@JsonIgnoreProperties( value = { "actionButton" }, allowSetters = true )
	private List<ActionButtonStyleDTO> actionButtonStyles;

	private Long idOrganizacao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataExclusao;
	private LocalDateTime dataModificacao;
}
