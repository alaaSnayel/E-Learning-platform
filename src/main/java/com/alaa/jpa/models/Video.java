package com.alaa.jpa.models;

import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

// import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
// @DiscriminatorValue("V")
// @PrimaryKeyJoinColumn(name = "video_id")
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class Video extends Resource{
  private int length;
}
