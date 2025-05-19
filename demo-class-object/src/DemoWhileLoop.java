public class DemoWhileLoop {
  public static void main(String[] args) {
    // Alternative - for loop
    // int i = 0; // ! Don't use i,j,k as local variable name in any method

    for (int i = 0; i < 5; i++) {
      System.out.println("hello");
    }

    int count = 5;
    while (count > 0) { // 5,4,3,2,1
      System.out.println("hello");
    }

    // ! Difference
    // 1. While: flexible for modifiers (conditional); For: standard writing code style
    // 2. While: flexible for break;
  }
}