import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Shape {
  public abstract double area();

  public static <T extends Shape> double totalArea(List<T> shape) {
    return -1;
  }

  public static double totalArea2(List<Shape> shape) {
    return -1;
  }

  public static double totalArea3(List<Circle> shape) {
    return -1;
  }

  public static double totalArea4(List<Rectangular> shape) {
    return -1;
  }

  // Cricle, Rectangular
  public static void main(String[] args) {
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Circle());
    shapes.add(new Circle());
    shapes.add(new Rectangular());

    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle());
    circles.add(new Circle());

    List<Rectangular> rectangulars = new ArrayList<>();
    rectangulars.add(new Rectangular());
    rectangulars.add(new Rectangular());

    Shape.totalArea(shapes); // List<Circle>, List<Rectangular>, List<Shape>
    Shape.totalArea(circles);
    Shape.totalArea(rectangulars);

    Shape.totalArea2(shapes); // List<Shape>
    
    // ! Not allowed
    // Shape.totalArea2(circles);
    // Shape.totalArea2(rectangulars);
  }
}