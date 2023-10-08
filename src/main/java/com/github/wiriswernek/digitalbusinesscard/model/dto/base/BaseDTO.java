package com.github.wiriswernek.digitalbusinesscard.model.dto.base;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseDTO {

	private Long idOrganizacao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataExclusao;
	private LocalDateTime dataModificacao;
}
