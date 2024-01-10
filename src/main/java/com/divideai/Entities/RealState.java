package com.divideai.Entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "RealState")
@Table(name = "real_states")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class RealState {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
    private Integer id;

    @Size(max = 150, min = 3, message = "The name must contain between 3 and 150 characters. ")
    @NotNull(message = "The name is required")
    @Column(name = "name")
    private String name;

    @Size(max = 14, min = 14, message = "The cnpj must be have 14 characters. ")
    @NotBlank(message = "The cnpj is required")
    @Column(name = "cnpj")
    private String cnpj;
    
    @OneToMany
	@JoinColumn(name = "id_address")
	@NotNull(message = "The address is required. ")
    private Address address;

    @NotBlank(message = "The contact is required. ")
    @Column(name = "contact")
    private String contact;

    @ManyToOne
	@JoinColumn(name = "id_properties")
	@NotNull(message = "The property is required. ")
	private Property property;

}
