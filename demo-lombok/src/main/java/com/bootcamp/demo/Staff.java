package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Staff {
  private String name;
  private String hkid;
  private String email;

  public static void main(String[] args) {
    Staff s1 = Staff.builder()
      .name("John")
      .hkid("H1234567")
      .email("john@gmail.com")
      .build();
    System.out.println(s1);
  }
}