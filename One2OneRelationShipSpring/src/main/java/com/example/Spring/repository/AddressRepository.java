package com.example.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}