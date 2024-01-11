package com.divideai.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divideai.Entities.Profile;
import com.divideai.repository.ProfilesRepository;
import com.divideai.services.ProfileService;
import com.google.common.base.Preconditions;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfilesRepository profilesRepository;
	
	@Override
	public Profile save(Profile profile) {
		Preconditions.checkNotNull(profile, "The profile is required to save. ");
		return profilesRepository.save(profile);
	}

}
