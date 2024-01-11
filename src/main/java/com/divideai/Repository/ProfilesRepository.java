package com.divideai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divideai.Entities.Profile;

@Repository
public interface ProfilesRepository extends JpaRepository<Profile, Integer> {

}
