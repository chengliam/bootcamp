public class DemoRecursion {
  public static void main(String[] args) {
    // n = 10
    // 1 + 2 + 3 + 4 + 5 ... + n
    int sum = 0;
    int n = 5;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum); // 15

    // recursion
    System.out.println(sum(5)); // 15

    // 2. even numbers
    System.out.println(sumEvenNumbers(11)); // 10 + 8 + 6 + 4 + 2 = 30
  }

  public static int sum(int n) {
    // Step 1: base case (exit criteria)
    if (n == 1)
      return 1;
    // Step 2: call it self
    return n + sum(n - 1);
  }
  // 5 + sum(4)
  // 4 + sum(3)
  // 3 + sum(2)
  // 2 + sum(1)
  // n == 1 finally

  // result=1+2+3+4+5

  // 2. given n, sum up all even numbers, starting from 1
  public static int sumEvenNumbers(int n) {
    if (n % 2 == 1)
      n--;
    return sum2(n);
  }

  // sequence: 2 + 4 + 6 + n
  public static int sum2(int n) {
    // Step 1: base case (exit criteria)
    if (n == 2)
      return 2;
    // Step 2: call it self
    return n + sum2(n - 2);
  }
}