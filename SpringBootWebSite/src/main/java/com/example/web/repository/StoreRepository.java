package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.Countrie;
import com.example.web.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long>{

}
