package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  void testSum() {
    Calculator calculator = new Calculator();
    assertEquals(7, calculator.sum(3, 4));
  }
}