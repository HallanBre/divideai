package com.divideai.services.impl;

import com.divideai.Entities.ProfileAvailabilityToLive;
import com.divideai.repository.ProfilesAvailabilityToLiveRepository;
import com.divideai.services.ProfileAvailabilityToLiveService;
import com.google.common.base.Preconditions;

public class ProfileAvailabilityToLiveServiceImpl implements ProfileAvailabilityToLiveService{

	private ProfilesAvailabilityToLiveRepository profilesAvailabilityToLiveRepository;
	
	@Override
	public ProfileAvailabilityToLive save(ProfileAvailabilityToLive profileAvailabilityToLive) {
		Preconditions.checkNotNull(profileAvailabilityToLive, "Profile availability to live is required. ");
		return profilesAvailabilityToLiveRepository.save(profileAvailabilityToLive);
	}

}
