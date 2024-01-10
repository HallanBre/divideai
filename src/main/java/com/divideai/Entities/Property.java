package com.divideai.Entities;

import java.math.BigDecimal;

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

@Entity(name = "Property")
@Table(name = "properties")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Property {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
    private Integer id;
    
	@ManyToOne
	@JoinColumn(name = "id_address")
	@NotNull(message = "The address is required. ")
    private Address address;
    
    @NotNull(message = "The value is required")
    @Column(name = "value")
    private BigDecimal value;

}
