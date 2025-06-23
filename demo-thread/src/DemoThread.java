import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread {
  private int x;
  // ! Solution 2: AtomicInteger
  private AtomicInteger y = new AtomicInteger(0);

  //！ Solution 1: synchronized (for method use)
  // ! locking the method (static or instance)
  // Only one commander can ask this dog to sleep
  public synchronized void addOne() {
    this.x = this.x + 1;
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) { // main thread
    DemoThread demoThread = new DemoThread();

    Runnable task1 = () -> {
      for (int i = 0; i < 100_000; i++) {
        demoThread.addOne();
      }
    };
    // main thread
    Thread worker1 = new Thread(task1); // created thread 1
    Thread worker2 = new Thread(task1); // created thread 2

    worker1.start(); // inform worker 1 to start working
    worker2.start(); // inform worker 2 to start working

    try {
      worker1.join(); // main thread wait worker 1 here, until worker 1 completed the task
      worker2.join(); // main thread wait worker 2 here, until worker 2 completed the task
    } catch(InterruptedException e) {

    }

    System.out.println(demoThread.getX()); // 200000

  }
}
