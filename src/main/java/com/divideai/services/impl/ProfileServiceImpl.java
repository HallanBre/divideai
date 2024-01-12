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

	@Override
	public Profile getBy(Integer idUser) {
		Preconditions.checkNotNull(idUser, "The user is required to find profile. ");
		Profile findedProfile = profilesRepository.getBy(idUser);
		Preconditions.checkNotNull(findedProfile, "The current user does not have a profile. ");
		return findedProfile;
	}

}
