package com.divideai.services;

import org.springframework.validation.annotation.Validated;

import com.divideai.Entities.ProfileAvailabilityToLive;

import jakarta.validation.constraints.NotNull;

@Validated
public interface ProfileAvailabilityToLiveService {

	public ProfileAvailabilityToLive save (
			@NotNull(message = "Profiles availability to live is required. ")
			ProfileAvailabilityToLive profileAvailabilityToLive);
}
