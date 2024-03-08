package com.mondomaine.repository;

import com.mondomaine.model.Garage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GarageRepository extends JpaRepository<Garage, Long> {
}