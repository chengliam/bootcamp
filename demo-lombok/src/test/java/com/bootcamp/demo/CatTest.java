package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CatTest {

  // ! Fake Object (But without real implementation)
  @Mock
  private Calculator calculator;

  @InjectMocks
  private Cat cat;

  @Test
  void testCatGetter() {
    // getter
    Cat c1 = new Cat("John", 13);
    assertEquals(13, c1.getAge());
    assertEquals("John", c1.getName());
  }

  @Test
  void testCatSetter() {
    Cat c1 = new Cat("John", 13);
    assertEquals(13, c1.getAge());
    c1.setAge(10);
    assertEquals(10, c1.getAge());
  }

  @Test
  void testCatArgContructor() {
    Cat c1 = new Cat("John", 13);
    assertEquals(13, c1.getAge());
    assertEquals("John", c1.getName());
  }

  @Test
  void testCatHashCode() {
    Cat c1 = new Cat("John", 13);
    Cat c2 = new Cat("John", 13);
    assertEquals(true, c1.hashCode() == c2.hashCode());
  }

  @Test
  void testCatEquals() {
    Cat c1 = new Cat("John", 13);
    Cat c2 = new Cat("John", 13);
    assertEquals(true, c1.equals(c2));
  }

  // ! From Unit Test perspective, 
  // ! subtract() should not be wrong because fail of sum()
  @Test
  void testSubtract() {
    // ! Making assumpution....
    Mockito.when(this.calculator.sum(3, 4)).thenReturn(100);
    // Cat cat = new Cat("John", 10, this.calculator);
    // ! Start testing....
    int actualResult = this.cat.subtract(10, 3, 4);
    // Test case
    assertEquals(-90, actualResult);
    Mockito.verify(this.calculator, times(1)).sum(3, 4);
  }
}