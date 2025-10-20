package com.alaa.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alaa.jpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
