package com.divideai.services;

import org.springframework.validation.annotation.Validated;

import com.divideai.Entities.Profile;

import jakarta.validation.constraints.NotNull;

@Validated
public interface ProfileService {
		
	public Profile save(
			@NotNull(message = "The profile is required. ")
			Profile profile);

}
