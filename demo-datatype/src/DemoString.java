public class DemoString {
  public static void main(String[] args) {
    // String is NOT primitive, which consist of a set of char values
    String s = "John";
    String s2 = "Dear Sir,";

    // 8 Primitives -> store values ONLY
    // String -> Store values + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); // Vincent

    // Function 1: equals()
    System.out.println(s3.equals("Vincent")); // true
    System.out.println(s3.equals("vincent")); // false, case sensitive

    // Function 2: length()
    System.out.println(s3.length()); // 7

    // Function 3: charAt()
    // index starts with 0
    // index range 0-6, length=7
    System.out.println(s3.charAt(2)); // 'n', the char at position 3
    // System.out.println(s3.charAt(7)); // out of range
    // System.out.println(s3.charAt(-1)); // out of range

    // Question
    // print the last character of s3
    s3 = "Steven";
    // length(), charAt()
    System.out.println(s3.charAt(s3.length() - 1)); // n

    // Find the middle character of name
    String name = "Vincent"; // o
    // Joey -> e
    // Vincent -> c
    System.out.println(name.charAt(name.length() / 2));

    // Function 4: indexOf(), lastIndexOf()
    String s4 = "Sally";
    System.out.println(s4.indexOf('a')); // 1
    System.out.println(s4.indexOf('b')); // -1
    System.out.println(s4.indexOf('l')); // 2, first character of l
    System.out.println(s4.lastIndexOf('l')); // 3, last character of l
    System.out.println(s4.indexOf("ll")); // 2
    System.out.println(s4.lastIndexOf("ll")); // 2, last character of l

    // Function 5: contains()
    System.out.println(s4.contains("ll")); // true, Sally contains ll
    System.out.println(s4.contains("lll")); // false, Sally does not contain lll

    if (s4.contains("ll")) {
      System.out.println("The name contains \"ll\"");
    }

    // Function 6: startsWith(), endsWith()
    System.out.println(s4.startsWith("Sa")); // true
    System.out.println(s4.startsWith("Sab")); // false
    System.out.println(s4.endsWith("lly")); // true
    System.out.println(s4.endsWith("llly")); // false

    if (s4.startsWith("sa")) {
      System.out.println("hello");
    } else {
      System.out.println("goodbye"); // print
    }

    // Function 7 : isEmpty()
    String s5 = ""; // empty String
    System.out.println(s5.isEmpty()); // true
    System.out.println(s4.isEmpty()); // false

    if (s5.isEmpty()) {
      System.out.println("s5 is really an empty String.");
    } else {
      System.out.println("s5 is NOT an empty String.");
    }

    // Function 8: concat()
    String s6 = "abc";
    System.out.println(s6.concat("vincent")); // abcvincent
    System.out.println(s6); // abc

    // Function 9: replace()
    String s7 = "hello";
    System.out.println(s7.replace('l', 'x')); // hexxo
    System.out.println(s7.replace("ll", "abc")); // heabco
    System.out.println(s7); // hello

    // Function 10: substring()
    String s8 = "hello world";
    System.out.println(s8.substring(4, 7)); // "o w"

    // Function 11: toLowerCase(), toUpperCase()
    String s9 = "Hello";
    System.out.println(s9.toUpperCase()); // HELLO
    System.out.println(s9.toLowerCase()); // hello

    // Function 12: valueOf() -> Conversion
    int x = 3;
    String ss = String.valueOf(x);
    System.out.println(ss); // 3
    String ss2 = String.valueOf(3.3);
    System.out.println(ss2); // 3.3

    double d1 = Double.valueOf("3.3");
    System.out.println(d1); // 3.3
  }
}