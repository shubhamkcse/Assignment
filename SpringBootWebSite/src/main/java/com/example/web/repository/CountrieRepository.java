package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.Countrie;

@Repository
public interface CountrieRepository extends JpaRepository<Countrie, Long>{

}
