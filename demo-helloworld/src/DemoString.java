import com.azul.crs.client.service.VMToolingClient;

public class DemoString {
  public static void main(String[] args) {
    // String is NOT prinitve, which consist of a set char values
    String s = "John";
    String s2 = "Dear Sir";

    // 8 Primitive -> store values ONLY
    // String -> Store value +functions
    // String can not use "=="

    // Function 1: equals()
    String s3 = "Liam";
    System.out.println(s3);
    s3 = "Kiam";
    System.out.println(s3);
    System.out.println(s3.equals("Liam"));

    //Function 2: length()
    //index starts with 0
    //can not use (-)1, but ok 1
    System.out.println(s3.length());

    //Function 3: charAt()
    s3 = "djfhasd";
    System.out.println(s3.charAt(s3.length()-1));


    //Home work
    //Find the mniddle character of name
    String name = "Joey"; //0
    //Joey -> e
    //Vincent --> c

    System.out.println(name.charAt(name.length()/2));
    name = "Vincent";
    //System.out.println(name.charAt(0));
    System.out.println(name.charAt(name.length()/2));
    //System.out.println(name.charAt(name.length()/2-1));
    //System.out.println(name.charAt(name.length()/2+1));
    //System.out.println(name.charAt((name.length()/2)-1));

    // Function 4: indexOf()
    String s4 = "Sally";
    System.out.println(s4.indexOf('a')); // show 1, "a" in the position 1
    System.out.println(s4.indexOf('b')); // show -1, means there are no "b"
    System.out.println(s4.indexOf('l')); // show 2, cause 
    System.out.println(s4.lastIndexOf('l'));
    System.out.println(s4.indexOf("ll"));

    // Function 5: contains()
    System.out.println(s4.contains("ll"));
    System.out.println(s4.contains("lll"));

    //Function 6: startWith(), endWith()
    System.out.println(s4.startsWith("Sa"));
    System.out.println(s4.startsWith("Sab"));
    System.out.println(s4.endsWith("lly"));

    //Function 7: empty()
    String s5 = ""; //empty String
    System.out.println(s5.isEmpty()); // true
    System.out.println(s4.isEmpty()); // false

    if (s5.isEmpty()) {
      System.out.println("s5 is really an empty String");
    } else {
      System.out.println("s5 is NOT an empty String");
    }

    if (s4.contains("ll")) {
      System.out.println("s4 is contains \"ll\"");
    }

    //Function 8: contcat
    String s6 = "abc";
    System.out.println(s6.concat("Liam")); // can customis
    System.out.println(s6);

    //Function 9: replace
    String s7 = "Petter";
    System.out.println(s7.replace("t", "xo"));

    // Function 10: substring
    String s10 = "hello world";
    System.out.println(s10.substring(4, 7)); 

    // Function 11: toLowerCase(), toUppweCase
    String s11 = "Hello";
    System.out.println(s11.toUpperCase());
    System.out.println(s11.toLowerCase());

    // Function 12: valueOf() --> Conversion
    int i12 = 3;
    String s12 = String.valueOf(i12);
    System.out.println(s12); // print out 3
    String ss12 = String.valueOf(3.4);
    System.out.println(ss12); // print out 3.4

    double d12 = Double.valueOf("3.3");
    System.out.println(d12); // print out 3.3

  }
  
}
