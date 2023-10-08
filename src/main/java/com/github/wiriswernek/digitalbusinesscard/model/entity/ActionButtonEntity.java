package com.github.wiriswernek.digitalbusinesscard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.github.wiriswernek.digitalbusinesscard.model.entity.base.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table( name = "ACTION_BUTTONS" )
public class ActionButtonEntity extends BaseEntity {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
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

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", nullable=false)
	private UserEntity usuario;
}
