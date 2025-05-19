public class DemoASCII {
  public static void main(String[] args) {
    char c = 'a';
    int x = c;
    System.out.println(x);

    int y = 65;
    char c2 = (char)y;
    System.out.println(c2);

    System.out.println((char)48);

    System.out.println((char)65610);

    int x1 = 128;
    byte b1 = (byte) x1;
    System.out.println(b1);

    // byte -> short -> int -> long -> float -> double
    // char -> int
    float f1 = 10L;
    System.out.println(f1);
    double d1 = 100.25f;
    System.out.println(d1);

    long l2 = (long)10.9f;
    System.out.println(l2);

    int x8 = 33000;
    short s3 = (short) 48;
    System.out.println(s3);

  }
}
