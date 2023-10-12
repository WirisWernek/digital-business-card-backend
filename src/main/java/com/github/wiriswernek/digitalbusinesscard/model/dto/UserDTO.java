package com.github.wiriswernek.digitalbusinesscard.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO extends BaseDTO {

	private Long id;
	private String username;

	@JsonIgnore
	private List<ActionButtonDTO> actionsButtons;

	@JsonIgnore
	private List<ContactLinkDTO> contactLinks;

	@JsonIgnore
	private List<LinkDTO> links;

	@JsonIgnore
	private List<OptionalButtonDTO> optionalButtons;
}
