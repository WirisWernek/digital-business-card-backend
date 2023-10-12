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
public class LinkDTO extends BaseDTO {

	private Long id;
	private String link;
	private String texto;
	private TipoLinkDTO tipo;

	@JsonIgnoreProperties(value = { "link" }, allowSetters = true)
	private List<LinkStyleDTO> linkStyles;

	@JsonIgnoreProperties(value = { "links" }, allowSetters = true)
	private UserDTO usuario;

}
