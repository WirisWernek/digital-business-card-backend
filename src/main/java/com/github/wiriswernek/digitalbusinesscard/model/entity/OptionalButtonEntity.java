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
@Table(name = "OPTIONAL_BUTTONS")
public class OptionalButtonEntity extends BaseEntity {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name = "ID")
	private Long id;

	@Column(name="PIX_ENABLE")
	private boolean pixEnable;

	@Column(name="AVALIACAO_ENABLE")
	private boolean avaliacaoEnable;
	
	@Column(name="NEWSLETTER_ENABLE")
	private boolean newsletterEnable;
	
	@Column(name="ANOTACAO_ENABLE")
	private boolean anotacaoEnable;
	
	@Column(name="EMAIL_RAPIDO_ENABLE")
	private boolean emailRapidoEnable;
	
	@Column(name="CHAVE_PIX")
	private String chavePix;

	@Column(name="EMAIL_RAPIDO_ENDERECO")
	private String emailRapidoEndereco;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", nullable=false)
	private UserEntity usuario;
}
