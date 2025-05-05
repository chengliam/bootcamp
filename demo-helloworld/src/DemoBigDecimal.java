import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double r1 = 0.1 + 0.2;
    System.out.println(r1); // 0.30000000000000004

    // 2 approaches to create BigDecimal Object
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = BigDecimal.valueOf(0.2);
    
    BigDecimal bd3 = bd1.add(bd2); //Math
    System.out.println(bd3);

    float f1 = bd3.floatValue();
    System.out.println(f1);
    double d1 = bd3.doubleValue();
    System.out.println(d1);
    int i1 = bd3.intValue();
    System.out.println(i1);

    // subtract(), multiply()
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println(bd4);

    System.out.println(0.3 - 0.1);
    double result = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result);

    System.out.println(0.1 * 0.2);
    double result2 = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result2);

    // divide
    System.out.println(0.3 / 0.1);
    double result3 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result3);

    double result4 = BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.DOWN).doubleValue();
    System.out.println(result4);

    double result5 = BigDecimal.valueOf(16.5).divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_UP).doubleValue();
    System.out.println(result5);
  }
  
}
