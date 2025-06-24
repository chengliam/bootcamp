import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SuperQueue {
  private Stack<String> s1;
  private Stack<String> s2;

  // 2 Stacks to implement SuperQueue (same as Queue)
  // 1. add
  public void add(String element) {
    // ! step 1: loop move to 2nd stack
    // ! step 2: put the element into 1st stack
    // ! step 3: loop move back to 1st stack
  }
  // 2. poll
  // 3. size
  // 4. isEmpty

  public static void main(String[] args) {
    Queue<String> q1 = new LinkedList<>();
    q1.add("John");
    q1.add("Peter");
    q1.add("Oscar");
    System.out.println(q1.poll()); // Oscar
    System.out.println(q1.size());
    System.out.println(q1.isEmpty());
  }
}