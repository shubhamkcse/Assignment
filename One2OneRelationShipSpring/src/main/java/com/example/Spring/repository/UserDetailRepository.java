package com.example.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.model.UserDetails;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetails, Long>{

}
