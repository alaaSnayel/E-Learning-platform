package com.alaa.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Author {
  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "author_sequence"
  )
  @SequenceGenerator(
    name = "author_sequence",
    sequenceName = "author_sequence",
    allocationSize = 1
  )
  private Integer id;

  private String firstname;

  private String lastname;

  private String email;

  private int age;
}
