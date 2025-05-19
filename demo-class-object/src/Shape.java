public class Shape {
  private static int counter = 0;
  private static final double PI = 3.14159; // constant
  private final String name = "John";
  // final -> finalized, 不變

  public Shape() {

  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println(Shape.PI);
    // ! because Shape.PI is a "final" variable, so cannot be modified.
    // Shape.PI =+; will be error

  Shape.counter++;
  System.out.println(Shape.counter);

  new Shape().counter++; // Not recommended
  Shape.counter++; // Normal usage
  System.out.println(Shape.counter);

  // print John
  Shape s1 = new Shape();
  System.out.println(s1.getName());
  System.out.println(new Shape().getName());
  }
  
}
