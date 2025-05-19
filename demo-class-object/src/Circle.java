import java.math.BigDecimal;

public class Circle {
  private double radius;
  private String color;
  // private double area; // violate OOP concept

  // Type of Method: Presentation
  public double area() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public Circle (double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public void setRadius (double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public static double area2(double radius) {
    return BigDecimal.valueOf(radius)
    .multiply(BigDecimal.valueOf(radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    System.out.println(c1.area());

    Circle c2 = new Circle(4.5, "BLUE");
    
    Circle[] circles = new Circle[2];
    circles[0] = c2;
    circles[1] = c1;

    System.out.println(circles[0].getColor());
    System.out.println(circles[1].area());

    System.out.println(Circle.area2(3.5));
  }
  
}
