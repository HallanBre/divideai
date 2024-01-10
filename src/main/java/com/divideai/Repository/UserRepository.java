package com.divideai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.divideai.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("SELECT u " +
			"FROM User u " +
			"WHERE u.id = :id")
	public User findBy(@Param("id") Integer id);
	
	@Modifying
	@Query("DELETE " +
			"FROM User u " +
			"WHERE u.id = :id")
	public User deleteBy(@Param("id") Integer id);
	
}