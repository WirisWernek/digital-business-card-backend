package com.github.wiriswernek.digitalbusinesscard.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "OPTIONAL_BUTTONS")
public class OptionalButtonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "PIX_ENABLE")
	private boolean pixEnable;

	@Column(name = "AVALIACAO_ENABLE")
	private boolean avaliacaoEnable;

	@Column(name = "NEWSLETTER_ENABLE")
	private boolean newsletterEnable;

	@Column(name = "ANOTACAO_ENABLE")
	private boolean anotacaoEnable;

	@Column(name = "EMAIL_RAPIDO_ENABLE")
	private boolean emailRapidoEnable;

	@Column(name = "CHAVE_PIX")
	private String chavePix;

	@Column(name = "EMAIL_RAPIDO_ENDERECO")
	private String emailRapidoEndereco;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", nullable = false)
	private UserEntity usuario;
	@Column(name = "ID_ORGANIZACAO")
	@NotNull(message = "IdOrganização não pode ser nulo!")
	@NotBlank(message = "IdOrganização não pode ser vazio!")
	protected Long idOrganizacao;

	@Column(name = "DATA_CRIACAO")
	@NotNull(message = "Data de Criação não pode ser nula!")
	protected LocalDateTime dataCriacao;

	@Column(name = "DATA_EXCLUSAO")
	protected LocalDateTime dataExclusao;

	@Column(name = "DATA_ATUALIZACAO")
	protected LocalDateTime dataModificacao;
}
