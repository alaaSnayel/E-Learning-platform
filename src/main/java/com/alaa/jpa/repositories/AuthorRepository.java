package com.alaa.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alaa.jpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
  List<Author> findAllByFirstName(String fn);
}
