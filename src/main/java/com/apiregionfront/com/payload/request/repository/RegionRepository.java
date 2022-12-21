package com.apiregionfront.com.payload.request.repository;


import com.apiregionfront.com.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
