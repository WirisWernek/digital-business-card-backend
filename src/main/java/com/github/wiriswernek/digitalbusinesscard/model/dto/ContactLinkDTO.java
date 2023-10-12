package com.github.wiriswernek.digitalbusinesscard.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactLinkDTO extends BaseDTO {

	private Long id;
	private String whatsapp;
	private String email;
	private String telefone;
	private String download;

	@JsonIgnoreProperties(value = { "contactLinks" }, allowSetters = true)
	private UserDTO usuario;
}
