// Inherit
public abstract class Animal { // Parent Class: concrete class or abstract class
  private int age;

  // ! Why abstract class still have constructor?
  // For child class constructor to call.
  public Animal(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Animal animal = new Cat(13);
    Cat cat = new Cat("Peter", 17);

    // ! Abstract class is not for object creation
    // Animal animal2 = new Animal(13);

    // ! Polymorphism (Runtime/Dynamic Polymorphism)
    // ! 1. instance method call is determined by object reference type (compile-time)
    // ! 2. the implementation of method is determined by actual object itself (runtime)
    Animal cat2 = new Cat("John", 20);
    // "cat2" -> "object reference"
    // "Animal" -> "object reference type"
    // "new Cat("John", 20)" -> "object" / "object reference value"

    cat2 = new Dog(10, 7);
    System.out.println(cat2.getAge()); // -99
    // Java cannot ensure cat2 is pointing to Cat Object, it may be Dog object.
    cat2 = new Cat("Peter", 80);
    System.out.println(cat2.getAge()); // 90

    // ! 組合skill: instanceOf + downcast
    if (cat2 instanceof Cat) {
      Cat animal2 = (Cat) cat2;
      System.out.println(animal2.getName());
    } else if (cat2 instanceof Dog) {
      Dog animal3 = (Dog) cat2;
      System.out.println(animal3.getWeight()); // 10.0
    }

  }

}