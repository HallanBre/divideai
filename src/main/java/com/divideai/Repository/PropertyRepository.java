package com.divideai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.divideai.Entities.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> {
	
}