package com.divideai.services;

import org.springframework.validation.annotation.Validated;

import com.divideai.Entities.AvailabilityToLive;

import jakarta.validation.constraints.NotNull;

@Validated
public interface AvailabilityToLiveService {
	
	public AvailabilityToLive save(
			@NotNull(message = "Availability to live is required to save. ")
			AvailabilityToLive availabilityToLive);
	
}
