import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height, weight
  private String varName;
  private double varHeight;
  private double varWeight;

  //! method:
  // BMI (overweight) -> double
  // isOverweight -> boolean (BMI > 25)
  public void setInfo (String name, double height, double weight) {
    this.varName = name;
    this.varHeight = height;
    this.varWeight = weight;
  }

  public String getName() {
    return this.varName;
  }

  public double getHeight() {
    return this.varHeight;
  }

  public double getWeight() {
    return this.varWeight;
  }

  public double getBMI() {
    return BigDecimal.valueOf(varWeight).divide(BigDecimal.valueOf(Math.pow(this.varHeight, 2)), 1, RoundingMode.HALF_UP).doubleValue();
  }

  public String getStatus() {
    if (getBMI() < 18.5) {
      return "underweight";
    } else if (getBMI() >= 18.5 && getBMI() < 25) {
      return "normal";
    } else {
      return "overweight";
    }
  }

  public String getAllInfo() {
    return this.varName + "-" + this.varHeight + "M-" + this.varWeight + "kg-" + this.getBMI();
  }
  //main
  //Person[] -> p1, p2, p3
  //print out their bmi and weight status
  //BMI standard
  //below 18.5 = Underweight
  //18.5 to 25 = Normal
  //over 25 = Overweight
  // for loop () -> array -> print out their bmi and weight status
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setInfo("Liam", 1.75, 70);
    Person p2 = new Person();
    p2.setInfo("kitkit", 1.73, 80);
    Person p3 = new Person();
    p3.setInfo("manlong", 1.73, 55);

    System.out.println(p1.getBMI());
    System.out.println(p2.getStatus());

    Person[] ppp = new Person[3];
    ppp[0] = p1;
    ppp[1] = p2;
    ppp[2] = p3;

    System.out.println(p1.getAllInfo());
    System.out.println(p2.getAllInfo());
    System.out.println(p3.getAllInfo());
    System.out.println(ppp[0]);

  }
}
