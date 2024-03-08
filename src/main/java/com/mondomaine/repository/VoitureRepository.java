package com.mondomaine.repository;

import com.mondomaine.model.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
}