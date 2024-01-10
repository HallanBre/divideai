package com.divideai.Entities;

import com.divideai.Entities.enums.Interest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "UserInterest")
@Table(name = "user_interests")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserInterest {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_user")
	@NotNull(message = "User is required. ")
	private User user;
	
	@Column(name = "interest")
    @NotNull(message = "The interest is required. ")
    @Enumerated(EnumType.STRING)
    private Interest interest;
	
}
