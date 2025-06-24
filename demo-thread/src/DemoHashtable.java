import java.util.HashMap;
import java.util.Map;

public class DemoHashtable {
  
  public static synchronized Map<String, Integer> plusOne(Map<String, Integer> map) {
    // ! 2 actions: getOrDefault and put
    map.put("bootcamp", map.getOrDefault("bootcamp", 0) + 1);
    return map;
  }

  public static void main(String[] args) {
    // Hashtable (Thead-safe) vs Hashmap (non thread-safe)
    Map<String, Integer> demoMap = new HashMap<>(); // non thread-safe

    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        plusOne(demoMap); // pass by reference
      }
    };

    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);
    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException ex) {

    }
    System.out.println(demoMap.get("bootcamp"));
  }
}