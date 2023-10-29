package com.github.wiriswernek.digitalbusinesscard.model.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

	@OneToMany(mappedBy = "optionalButton")
	private List<OptionalButtonStyleEntity> optionalButtonStyles;

	@Column(name = "ID_ORGANIZACAO")
	@NotNull(message = "IdOrganização não pode ser nulo!")
	@NotBlank(message = "IdOrganização não pode ser vazio!")
	private Long idOrganizacao;

	@Column(name = "DATA_CRIACAO")
	@NotNull(message = "Data de Criação não pode ser nula!")
	private LocalDateTime dataCriacao;

	@Column(name = "DATA_EXCLUSAO")
	private LocalDateTime dataExclusao;

	@Column(name = "DATA_ATUALIZACAO")
	private LocalDateTime dataModificacao;
}
