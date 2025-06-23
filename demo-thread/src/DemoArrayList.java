import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    List<Integer> integer = new ArrayList<>();
    // Task add 1 into list 100_000 times
    Runnable task = () -> {
      for (int i = 0; i <100_000; i++) {
        integer.add(1);
      }
    };
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e)

  }
}
