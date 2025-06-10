import java.util.List;

public class DemoOptional {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(Arrays.asList(8, -2, 100));
    Integer result = findFirstOddNumber(integers);
    System.out.println(result); // null
  }

  // what id no odd 
  
  public static Integer findFirstOddNumber(List<Integer> integer) {
    boolean found = false;
    for (Integer integer : integers) {
      if (integers % 2 == 1)
        return integer;
    }
    return null; // not found
  }

  // ! Java 8 has a better soultion for this scenario.
    public static Integer findFirstOddNumber(List<Integer> integer) {
    boolean found = false;
    for (Integer integer : integers) {
      if (integers % 2 == 1)
        return integer;
    }
    return null; // not found
}
