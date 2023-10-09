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
public class StyleDTO {
	
	private Long id;
	private String styleName;

	@JsonIgnoreProperties( value = { "style" }, allowSetters = true )
	private List<LinkStyleDTO> linkStyles;

	@JsonIgnoreProperties( value = { "style" }, allowSetters = true )
	private List<ActionButtonStyleDTO> actionButtonStyles;

	@JsonIgnoreProperties( value = { "style" }, allowSetters = true )
	private List<OptionalButtonStyleDTO> optionalButtonStyles;
	
	private Long idOrganizacao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataExclusao;
	private LocalDateTime dataModificacao;
}
