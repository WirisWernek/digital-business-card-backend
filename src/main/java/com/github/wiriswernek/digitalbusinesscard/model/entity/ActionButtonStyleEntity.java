package com.github.wiriswernek.digitalbusinesscard.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "ACTION_BUTTON_STYLES")
public class ActionButtonStyleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "ID_ACTION_BUTTON", nullable=false)
	private ActionButtonEntity actionButton;

	@ManyToOne
	@JoinColumn(name = "ID_STYLE", nullable=false)
	private StyleEntity style;
}
