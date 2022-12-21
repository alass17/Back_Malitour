package com.apiregionfront.com.payload.request.repository;

import com.apiregionfront.com.models.Population;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopulationRepository extends JpaRepository<Population, Long> {
}
