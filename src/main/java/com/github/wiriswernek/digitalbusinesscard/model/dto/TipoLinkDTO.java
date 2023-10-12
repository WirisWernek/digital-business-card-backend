package com.github.wiriswernek.digitalbusinesscard.model.dto;

import com.github.wiriswernek.digitalbusinesscard.model.dto.base.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoLinkDTO extends BaseDTO {
	private Long id;
	private String descricao;
}