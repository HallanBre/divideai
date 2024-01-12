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

@Entity(name = "ProfileAvailabilityToLive")
@Table(name = "profile_availability_to_live")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProfileAvailabilityToLive {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_profile")
	@NotNull(message = "Profile is required. ")
	private Profile profile;
	
	@ManyToOne
	@JoinColumn(name = "id_availability_to_live")
	@NotNull(message = "Availability is required. ")
	private AvailabilityToLive availabilityToLive;
	
}
