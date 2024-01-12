package com.divideai.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divideai.Entities.AvailabilityToLive;
import com.divideai.services.AvailabilityToLiveService;
import com.divideai.services.ProfileAvailabilityToLiveService;

@RestController
@RequestMapping("/availabilities")
public class AvailabilityToLiveController {

	@Autowired
	@Qualifier("availabilityToLiveServiceImpl")
	private AvailabilityToLiveService availabilityToLiveService;
	
	@Autowired
	@Qualifier("profileAvailabilityToLiveServiceImpl")
	private ProfileAvailabilityToLiveService profileAvailabilityToLiveService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody AvailabilityToLive availabilityToLive) {
		AvailabilityToLive findedAvailabilityToLive = availabilityToLiveService.save(availabilityToLive);
//		ProfileAvailabilityToLive findedProfileAvailabilityToLive = profileAvailabilityToLiveService.save(user);
		return ResponseEntity.ok(URI.create("/availabilities/id/" + findedAvailabilityToLive.getId()));
	}
}
