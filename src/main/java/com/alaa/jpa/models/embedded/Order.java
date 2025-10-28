package com.alaa.jpa.models.embedded;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
  @EmbeddedId
  private OrderId id;

  private String orderInfo;

  private String anotherField;
}
