package com.github.wiriswernek.digitalbusinesscard.model.dto.base;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseDTO {

	protected Long idOrganizacao;
	protected LocalDateTime dataCriacao;
	protected LocalDateTime dataExclusao;
	protected LocalDateTime dataModificacao;
}
