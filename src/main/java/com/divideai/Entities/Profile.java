package com.divideai.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "Profile")
@Table(name = "profiles")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Profile {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
    private Integer id;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "aboutYou")
	private String aboutYou;
	
	@OneToOne
    @JoinColumn(name = "id_user")
	@NotNull(message = "The user is required.")
    private User user;
	
	
}
