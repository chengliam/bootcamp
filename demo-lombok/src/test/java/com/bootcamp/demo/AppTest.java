package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
  
  @Test
  void testApp() {
    assertEquals(1, 1);
    assertEquals(1, new Person().add(1, 1));
    assertEquals(6, new Person().add(3, 2));
  }
}