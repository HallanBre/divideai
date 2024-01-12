package com.divideai.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "AvailabilityToLive")
@Table(name = "availability_to_live")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AvailabilityToLive {
	
	@Id
	@Column(name = "id")
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_adress")
	@NotNull(message = "Address is required. ")
	private Address address;
	
}
