package com.github.wiriswernek.digitalbusinesscard.model.entity.base;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BaseEntity {

	@Column( name = "ID_ORGANIZACAO" )
	@NotNull( message = "IdOrganização não pode ser nulo!" )
	@NotBlank( message = "IdOrganização não pode ser vazio!" )
	private Long idOrganizacao;

	@Column( name = "DATA_CRIACAO" )
	@NotNull( message = "Data de Criação não pode ser nula!" )
	private LocalDateTime dataCriacao;

	@Column( name = "DATA_EXCLUSAO" )
	private LocalDateTime dataExclusao;

	@Column( name = "DATA_ATUALIZACAO" )
	private LocalDateTime dataAtualizacao;
}
