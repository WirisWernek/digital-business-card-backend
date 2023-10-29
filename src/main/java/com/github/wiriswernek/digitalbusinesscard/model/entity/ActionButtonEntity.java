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
@Table(name = "ACTION_BUTTONS")
public class ActionButtonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "LINK")
	private String link;

	@Column(name = "ICONE_URL")
	private String icon;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "STYLE_NAME_ID")
	private String styleNameId;

	@OneToMany(mappedBy = "actionButton")
	private List<ActionButtonStyleEntity> actionButtonStyles;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", nullable = false)
	private UserEntity usuario;

	@Column(name = "ID_ORGANIZACAO")
	@NotNull(message = "IdOrganização não pode ser nulo!")
	@NotBlank(message = "IdOrganização não pode ser vazio!")
	private Long idOrganizacao;

	@Column(name = "DATA_CRIACAO")
	@NotNull(message = "Data de Criação não pode ser nula!")
	private LocalDateTime dataCriacao;

	@Column(name = "DATA_EXCLUSAO")
	private LocalDateTime dataExclusao;

	@Column(name = "DATA_MODIFICACAO")
	private LocalDateTime dataModificacao;
}
