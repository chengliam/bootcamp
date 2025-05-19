public class Child {
  private static int counter = 0;
  private long id;
  private String firstName;
  private String lastName;

  // constructor
  public Child(long id, String firstName, String lastName){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // getter
  public long getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  // method
  public boolean equals(Child child) {
    return this.id == Child.getId;
  }

  public static void main(String[] args) {
    Child c1 = new Child("Ken", "Chan");

    if (c1.getChildInfo().equals("Ken Chan")) {
      System.out.println("Same");
    }

    System.out.println(c1.equals(new Child("Ken", "Chan")));
    System.out.println(c1.equals(new Child("peter", "lee")));
  }
}
