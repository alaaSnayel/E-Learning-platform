package com.alaa.jpa.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name ="AUTHOR_TPL")
public class Author {
  @Id
  @GeneratedValue
  private Integer id;

  @Column(name = "f_name", length = 35)
  private String firstname;

  private String lastname;

  @Column(unique = true, nullable = false)
  private String email;

  private int age;

  @Column(updatable = false, nullable = false)
  private LocalDateTime createdAt;

  @Column(insertable = false)
  private LocalDateTime lastModified;
}
