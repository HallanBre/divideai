package com.divideai.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "Address")
@Table(name = "addresses")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Address {

	@Id
	@Column(name = "id")
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "city")
	@NotNull(message = "City is required. ")
	private String city;
	
	@Column(name = "district")
	@NotNull(message = "District is required. ")
	private String district;
	
	@Column(name = "state")
	@NotNull(message = "State is required. ")
	private String state;
	
	@Column(name = "street")
	@NotNull(message = "Street is required. ")
	private String street;
	
	@Column(name = "cep")
	@NotNull(message = "Cep is required. ")
	private String cep;
	
	@Column(name = "number")
	@NotNull(message = "Number is required. ")
	private String number;
	
	@Column(name = "complement")
	private String complement;
	
	
}
