import java.util.Comparator;

public class SortedByBall2 implements Comparator<Ball> {
  // Assignment: SortByBall2.java
  // Sort color first, if color is same, larger number goes first.
  // YELLOW,9 -> YELLOW,5 -> RED,1000 -> BLUE,10 -> BLUE, 2
  @Override
  public int compare(Ball o1, Ball o2) {
    if (o1.getColor() == o2.getColor()) {
      return o1.getNumber() > o2.getNumber() ? -1 : 1;
    }
    if (o1.getColor() == Ball.Color.YELLOW)
      return -1;
    if (o2.getColor() == Ball.Color.YELLOW)
      return 1;
    if (o1.getColor() == Ball.Color.RED)
      return -1;
    if (o2.getColor() == Ball.Color.RED)
      return 1;
    return -1;
  }
}