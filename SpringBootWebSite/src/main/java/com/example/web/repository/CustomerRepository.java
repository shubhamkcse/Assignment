package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
