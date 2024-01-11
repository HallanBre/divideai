package com.divideai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.divideai.Entities.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> {

    @Query("SELECT p " +
            "FROM Property p " +
            "WHERE p.id = :id")
    public Property findBy(@Param("id") Integer id);

    @Modifying
    @Query("DELETE " +
            "FROM Property p " +
            "WHERE p.id = :id")
    public Property deleteBy(@Param("id") Integer id);
}