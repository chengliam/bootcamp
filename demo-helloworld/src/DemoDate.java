import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    LocalDate ld1 = LocalDate.of(2025, 4, 28);
    LocalDate ld2 = LocalDate.of(2025, 3, 30);
    System.out.println(ld1.isAfter(ld2));
    System.out.println(ld2.isBefore(ld1));
    System.out.println(ld2.isEqual(ld1));

    LocalDate newDate = ld1.plusDays(7);
    System.out.println(newDate);

    System.out.println(LocalDate.of(2024, 12, 20).plusMonths(2));

    System.out.println(LocalDate.of(2025, 1, 31).minusDays(60));

    Month m1 = LocalDate.of(2025, 1, 2).getMonth();
    System.out.println(m1.getValue());
    System.out.println(m1.toString());
    System.out.println(LocalDate.of(2025, 1, 2).getYear());
    System.out.println(LocalDate.of(2025, 1, 2).getDayOfWeek());

    LocalDateTime dateTime = LocalDateTime.of(2024, 12, 1, 12, 21, 0);
    System.out.println();
  }
}