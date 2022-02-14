package com.example.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.modle.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{

}
