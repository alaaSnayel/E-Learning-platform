package com.alaa.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alaa.jpa.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
  List<Author> findAllByFirstName(String fn);

  List<Author> findAllByFirstNameIgnoreCase(String fn);

  List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);

  List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

  List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
