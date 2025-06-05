public class DemoLiteral {
  // ! Literal pool -> String
  // ! Intrenal Cache -> Integer, Byte, Short, Long, Boolean, Character
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = "olleh";
    System.out.println(s1.equals(s2));
    System.out.println(s3.equals(s2));

    System.out.println(s1 == s2);

    String s4 = new String("hello");
    System.out.println(s1 == s4);
    String s5 = new String("hello");
    System.out.println(s4 == s5); // false
    
    String s6 = new String("hello").intern(); // put into pool
    System.out.println(s1 == s6); // true
    System.out.println(s4 == s6); // false

    // -128 to 127
    Integer i1 = 127;
    Integer i2 = 127; // check if internal cache contain 127
    Integer i3 = new Integer(127);
    System.out.println(i1 == i2); // ture
    System.out.println(i1 == i3); // false

    // !
    Integer i4 = 128;
    Integer i5 = 128;
    System.out.println(i4 == i5); // false

    // -128 to 127
    Byte b1 = 127;
    Byte b2 = 127;
    System.out.println(b1 == b2); // true
    Byte b3 = new Byte("127");
    System.out.println(b1 == b3);

    // applies to Integer, Byte, Short, Long

    Boolean n1 = true;
    Boolean n2 = true;
    Boolean n3 = new Boolean(true);
    System.out.println(n1 == n2); // true
    System.out.println(n1 == n3); // false
    
    // Character (0-6xxxx), cache range 0-127
    Character c1 = 'A';
    Character c2 = 'A';
    Character c3 = new Character('A');
    System.out.println(c1 == c2);
    System.out.println(c1 == c3);

    // valueOf()
    Integer i10 = Integer.valueOf(100);
    Integer i11 = Integer.valueOf(100);
    System.out.println(i10 == i11);

    // Conclusion
    // ! For String, in real life, we should use "hello" or String.valueOf("hello")
    // !
  }
  
}
