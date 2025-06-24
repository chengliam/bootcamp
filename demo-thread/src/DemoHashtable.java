import java.util.HashMap;
import java.util.Map;

public class DemoHashtable {

  public static synchronized Map<String, Integer> plusOne(Map<String, Integer> map) {
    // ! 2 actions: getOrDefault and put
    map.put("bootcamp", map.getOrDefault("bootcamp", 0) + 1);
    return map;
  }

  public static void main(String[] args) {
    // Hashtable (Thread-safe) vs Hashmap (non thread-safe)
    Map<String, Integer> demoMap = new HashMap<>(); // non thread-safe, try "Hashtable<>()"

    Runnable task = () -> {
      for (int i = 0; i < 100_00; i++) {
        demoMap.put("bootcamp", demoMap.getOrDefault("bootcamp", 0) + 1);
      }
    };

    Thread worker1 = new Thread();
    Thread worker2 = new Thread();
    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException ex) {

    }
    System.out.println(demoMap.get);
  }
  
}
