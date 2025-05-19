public class Student {
  private static int counter = 0;
  private int id;
  private Candy[] candies;

  public Student() {
    this.id = ++counter[0];
    this.candies = new Candy[0];
  }

  public void receive(Candy candy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    
  }
  
}
