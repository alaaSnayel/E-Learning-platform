package com.alaa.jpa.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
@Entity
public class Author extends BaseEntity{

  @Column(name = "f_name", length = 35)
  private String firstname;

  private String lastname;

  @Column(unique = true, nullable = false)
  private String email;

  private int age;

  @ManyToMany(mappedBy = "authors")
  private List<Course> courses;
}















