import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {
    // Queue: first in first out
    // Stack: first in last out
    Stack<String> s1 = new Stack<>();
    s1.push("John");
    s1.push("Peter");
    s1.add("Vincent");
    System.out.println(s1.pop());
    System.out.println(s1.size());
    System.out.println(s1.pop());
    System.out.println(s1.size());
  }
  
}
