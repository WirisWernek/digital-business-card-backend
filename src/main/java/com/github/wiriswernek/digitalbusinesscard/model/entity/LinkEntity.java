package com.github.wiriswernek.digitalbusinesscard.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.github.wiriswernek.digitalbusinesscard.model.entity.base.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "LINKS")
public class LinkEntity extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "LINK")
	private String link;

	@Column(name = "TEXTO")
	private String texto;

	@ManyToOne
	@JoinColumn(name = "ID_TIPO", nullable=false)
	private TipoLinkEntity tipo;

	@OneToMany(mappedBy = "link")
	private List<LinkStyleEntity> linkStyles;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO", nullable=false)
	private UserEntity usuario;
}
