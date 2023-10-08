package com.github.wiriswernek.digitalbusinesscard.model.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "STYLES")
public class StyleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "STYLE_NAME")
	private String styleName;

	@OneToMany(mappedBy = "link")
	private List<LinkStyleEntity> linkStyles;

	@OneToMany(mappedBy = "actionButton")
	private List<ActionButtonStyleEntity> actionButtonStyles;

	@Column(name = "ID_ORGANIZACAO")
	@NotNull(message = "IdOrganização não pode ser nulo!")
	@NotBlank(message = "IdOrganização não pode ser vazio!")
	protected Long idOrganizacao;

	@Column(name = "DATA_CRIACAO")
	@NotNull(message = "Data de Criação não pode ser nula!")
	protected LocalDateTime dataCriacao;

	@Column(name = "DATA_EXCLUSAO")
	protected LocalDateTime dataExclusao;

	@Column(name = "DATA_MODIFICACAO")
	protected LocalDateTime dataModificacao;
}
