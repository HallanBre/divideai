package com.divideai.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divideai.Entities.Profile;
import com.divideai.services.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

	@Autowired
	@Qualifier("profileServiceImpl")
	private ProfileService profileService;
	
	@PostMapping
	public ResponseEntity<?> insert(@RequestBody Profile profile) {
		Profile savedProfile = profileService.save(profile);
		return ResponseEntity.created(URI.create("/profiles/id/" + savedProfile.getId())).build();
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<?> findBy(@PathVariable("id") Integer id) {
		Profile findedProfile = profileService.getBy(id);
		return ResponseEntity.ok(findedProfile);
	}
}
