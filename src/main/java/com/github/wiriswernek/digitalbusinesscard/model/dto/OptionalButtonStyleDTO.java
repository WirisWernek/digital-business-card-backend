package com.github.wiriswernek.digitalbusinesscard.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OptionalButtonStyleDTO extends BaseDTO {
	private Long id;

	@JsonIgnore
	private OptionalButtonDTO optionalButton;

	@JsonIgnoreProperties(value = { "optionalButtonStyles" }, allowSetters = true)
	private StyleDTO style;
}
