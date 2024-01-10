package com.divideai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divideai.Entities.RealState;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RealStateRepository extends JpaRepository<RealState, Integer> {

    @Query("SELECT r " +
            "FROM RealState r " +
            "Where r.id = :id")
    public RealState findBy(@Param("id") Integer id);

    @Modifying
    @Query("DELETE " +
            "FROM RealState r " +
            "WHERE r.id = :id")
    public RealState deleteBy(@Param("id") Integer id);
}