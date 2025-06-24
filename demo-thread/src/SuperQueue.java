import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SuperQueue {
  private Stack<String> s1;
  private Stack<String> s2;
  
  // 2 Stacks to implement SuperQueue (same as Queue, add(), )

  public static void main(String[] args) {
    Queue<String> q1 = new LinkedList<>();
    q1.add("John");
    q1.add("Peter");
    q1.add("Oscar");
    System.out.println(q1.poll());
    System.out.println(q1.size());
    System.out.println(q1.isEmpty());
  }
  
}
