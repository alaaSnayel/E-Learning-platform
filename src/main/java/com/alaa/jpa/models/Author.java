package com.alaa.jpa.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.TableGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Author {
  @Id
  @GeneratedValue(
    strategy = GenerationType.TABLE,
    generator = "author_id_generator"
  )
  @TableGenerator(
    name = "author_id_generator",
    table = "id_gen_table",
    pkColumnName = "id_name",
    valueColumnName = "gen_value",
    pkColumnValue = "author_id",
    initialValue = 1000,
    allocationSize = 1
  )
  private Integer id;

  private String firstname;

  private String lastname;

  private String email;

  private int age;
}
