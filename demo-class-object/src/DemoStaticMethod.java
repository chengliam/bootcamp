public class DemoStaticMethod {
  private int age;

  public DemoStaticMethod(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  // ! Most (90%) of the instance method are presentations
  // ! Presentation (Presenting the content of the object)
  public boolean isElderly() {
    return this.age > 65;
  }

  public boolean isChild() {
    return this.age < 18; // definition
  }

  public static boolean isElderly2(int age) {
    return age > 65;
  }

  // Why it can be instance method?
  // add static means below use exiting data
  public int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    DemoStaticMethod dsm = new DemoStaticMethod(10);
    System.out.println(dsm.getAge());
    System.out.println(dsm.isElderly());
    System.out.println(dsm.isChild());

    System.out.println(dsm.getAge() > 65);

    System.out.println(DemoStaticMethod.isElderly2(66));
  }
  
}
