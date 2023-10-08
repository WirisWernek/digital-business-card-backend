package com.github.wiriswernek.digitalbusinesscard.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "USERS")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "USERNAME")
	private String username;

	@OneToMany(mappedBy = "usuario")
	private List<ActionButtonEntity> actionsButtons;

	@OneToMany(mappedBy = "usuario")
	private List<ContactLinkEntity> contactLinks;

	@OneToMany(mappedBy = "usuario")
	private List<LinkEntity> links;

	@OneToMany(mappedBy = "usuario")
	private List<OptionalButtonEntity> optionalButtons;
}
