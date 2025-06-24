public class Candy {
  private static int count = 20;
  private String color;
  private int number;

  public Candy(String color, int number) {
    this.color = color;
    this.number = number;
  }

  public String getColor() {
    return this.color;
  }

  public int getNumber() {
    return this.number;
  }

}