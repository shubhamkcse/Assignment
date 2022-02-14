package com.example.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.model.Page;

@Repository
public interface PageRepository extends JpaRepository<Page, Long>{

}