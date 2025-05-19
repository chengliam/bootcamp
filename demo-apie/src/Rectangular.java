import java.math.BigDecimal;

public class Rectangular extends Shape {
  private double length;
  private double width;

  public Rectangular(String color, double length, double width) {
    super(color);
    this.length = length;
    this.width = width;
  }
  
  @Override
  public double area() {
    return BigDecimal.valueOf(this.length)
        .multiply(BigDecimal.valueOf(this.width)) //
        .doubleValue();
  }
}