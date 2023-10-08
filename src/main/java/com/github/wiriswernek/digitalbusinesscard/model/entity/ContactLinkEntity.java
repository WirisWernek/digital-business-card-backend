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
@Table( name = "CONTACT_LINKS" )
public class ContactLinkEntity extends BaseEntity {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name = "ID")
	private Long id;

	@Column(name = "WHATSAPP")
	private String whatsapp;

	@Column(name="EMAIL")
	private String email;

	@Column(name="TELEFONE")
	private String telefone;

	@Column(name="DOWNLOAD_LINK")
	private String download;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", nullable=false)
	private UserEntity usuario;
}
