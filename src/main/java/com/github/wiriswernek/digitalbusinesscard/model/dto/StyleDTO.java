package com.github.wiriswernek.digitalbusinesscard.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StyleDTO {

	private Long id;
	private String styleName;

	@JsonIgnore
	private List<LinkStyleDTO> linkStyles;

	@JsonIgnore
	private List<ActionButtonStyleDTO> actionButtonStyles;

	@JsonIgnore
	private List<OptionalButtonStyleDTO> optionalButtonStyles;
}
