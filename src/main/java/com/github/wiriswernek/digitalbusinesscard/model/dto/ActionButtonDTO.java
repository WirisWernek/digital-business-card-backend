package com.github.wiriswernek.digitalbusinesscard.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActionButtonDTO extends BaseDTO{

	private Long id;
	private String link;
	private String icon;
	private String descricao;
	private String styleNameId;

	@JsonIgnoreProperties( value = { "actionButton" }, allowSetters = true )
	private List<ActionButtonStyleDTO> actionButtonStyles;

	@JsonIgnoreProperties( value = { "actionsButtons" }, allowSetters = false )
	private UserDTO usuario;


}
