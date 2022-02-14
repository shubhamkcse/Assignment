package com.example.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}