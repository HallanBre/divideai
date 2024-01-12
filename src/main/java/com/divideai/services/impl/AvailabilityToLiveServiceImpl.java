package com.divideai.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divideai.Entities.AvailabilityToLive;
import com.divideai.repository.AvailabilityToLiveRepository;
import com.divideai.services.AvailabilityToLiveService;
import com.google.common.base.Preconditions;

@Service
public class AvailabilityToLiveServiceImpl implements AvailabilityToLiveService {

	@Autowired
	private AvailabilityToLiveRepository availabilityToLiveRepository;
	
	@Override
	public AvailabilityToLive save(AvailabilityToLive availabilityToLive) {
		Preconditions.checkNotNull(availabilityToLive, "The availability to live is required. ");
		return availabilityToLiveRepository.save(availabilityToLive);
	}

}
