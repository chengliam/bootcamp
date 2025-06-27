package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Cat extends Animal {
  private String name;
  private int age;
  private Calculator calculator;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Cat(String name, int age, double weight) {
    super(weight);
    this.name = name;
    this.age = age;
  }

  public Cat(String name, int age, double weight, Calculator calculator) {
    super(weight);
    this.name = name;
    this.age = age;
    this.calculator = calculator;
  }

  // ! what is the task of subtract()?
  // 7 - 10 -> -3
  public int subtract(int a, int x, int y) {
    return a - this.calculator.sum(x, y);
  }

  public static void main(String[] args) {
    Cat cat1 = new Cat("John", 2);
    Cat cat2 = new Cat();
    
    System.out.println(cat1.getAge());
    System.out.println(cat1.getName());
    System.out.println(cat1);

    cat2.setAge(7);
    cat2.setName("Peter");
    System.out.println(cat2);

    Cat cat3 = new Cat("John", 2);
    System.out.println(cat1.equals(cat3)); // true, override equals()
    System.out.println(cat1.hashCode() == cat3.hashCode()); // true, override hashCode()

    Cat cat4 = new Cat("Mary", 8, 6.7);
    Cat cat5 = new Cat("Mary", 8, 6.7);
    System.out.println(cat4);
    System.out.println(cat4.equals(cat5)); // true
    System.out.println(cat4.hashCode()); // 2394732
    System.out.println(cat5.hashCode()); // 2394732
  }
}