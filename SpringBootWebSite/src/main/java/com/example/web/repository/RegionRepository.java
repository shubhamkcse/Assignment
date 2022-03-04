package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long>{

}
