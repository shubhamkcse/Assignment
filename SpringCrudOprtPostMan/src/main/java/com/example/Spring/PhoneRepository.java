package com.example.Spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}