public class DemoSwitchExpression {
  public static void main(String[] args) {
    // "switch" is a bad idea:
    // 1) you have to remrember to use "break"
    // 2) there are no range checking
    // 3) have to manually check if all values ahs been covered

    Currency currency = Currency.USD;
    if (currency == Currency.HKD) {

    } else if (currency == Currency.USD) {

    } else if (currency == Currency.CNY) {

    }

    // switch expression
    // 1) Aviod Duplicate case
    // 2) Java 21:
    switch (currency) {
      case HKD -> System.out.println("Hong Kong Dollar");
      // case HKD -> System.out.println("Hong Kong Dollar");
      case USD -> System.out.println("US Dollar");
      // case CNY -> System.out.println("CNY");
    }
  }
  

  public static enum Currency {
    HKD, USD, CNY,;
  }
}
