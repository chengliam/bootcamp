public class DemoOperator {
  public static void main(String[] args) {
    // + - * / "%"
    // divided by Zero
    // int r = 10 / 0 ; // system error

    int r2 = 0 / 10;
    System.out.println(r2);

    int score1 = 71;
    int score2 = 82;

    double ave = (score1 + score2) / 2;

    System.out.println(ave);

    int r8 = 10 % 3;
    System.out.println(r8);

    // "==" mains, check if equals to.....

    // char
    // single quote
    // assign char value 'a' into char variable
    char c1 = 'a';
    System.out.println(c1);
    c1 = '$';
    c1 = '+';
    c1 = 'a';
    char c2 = 'A';
    System.out.println(c1 == c2);

    // float (store decime number)
    // 3.14159 is double value
    // so unsafe (assign double value to float variable)
    float f1 = 3.14159f;

    // problem
    f1 = 0.3f + 0.4f;
    System.out.println(f1);

    byte b40 = (byte) 129L;
    System.out.println(b40); // -127 (overflow)

    // + 1 and -1
    int t = 0;
    t++;
    ++t;
    t = t + 1;
    // "= t +" --> "+="
    t += 1;
    System.out.println(t);

    int v = 3;
    System.out.println(v);

    v = v * 3;
    System.out.println(v);

    v *= 4;
    System.out.println(v);

    // != means 'not='

    // Comparison
    // >, <, >=, ==, !=
    int score3 = 91;
    boolean isGradeA = score3 >= 90;
    System.out.println(isGradeA);

    char gender = 'F';
    boolean isFemale = gender != 'M';
    System.out.println(isFemale);


  }
  
}
