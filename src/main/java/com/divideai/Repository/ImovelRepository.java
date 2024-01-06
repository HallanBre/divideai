package com.divideai.Repository;

import com.divideai.Entities.ImovelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<ImovelEntity, Integer> {
}
