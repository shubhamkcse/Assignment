package com.example.SmallWebApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository extends JpaRepository<Person, Long>{

}
