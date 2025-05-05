public class Demoif {
  public static void main(String[] args) {
    int x = 31;
    if (x < 4){  // ture or false
      System.out.println("hello");
    }

    // if + else
    if (x<10){
      System.out.println("goodbye");
    }else{
      System.out.println("welcome");
    }

    // if + else if +else
    int y = 100;
    if (y<90) {
      System.out.println("y is smaller than 90");
    } else if (y >= 90 && y < 100) { //false
      System.out.println("y is 90 < y 99");
    } else { // y >==100
      System.out.println("y >=100");}

    // double w
    // if w < 100, print "ABC"
    // w between 103 and 110, print out "DEF"
    // for other values, print "XYZ"

    double w = 104 ;
    if (w < 100) {
      System.out.println("ABC");
    } else if (w >= 103 && w <= 110) {
      System.out.println("DEF");
    } else {
      System.out.println("XYZ");
    }

    // AND &&
    // OR ||
    int a = 3;
    int b = 14;
    if (a > 3 || b < 15) {
      System.out.println("a > 3 or b < 15.");
    } else {
      System.out.println("Error.");
    }

    int q = 4;
    int u = 80;
    if ( q > 2) {
      u = u + 2;
    } else if (q < 5) {
      u = u + 10;
    }
    System.out.println(u);

    q = 10;
    u = 100;
    if (q > 5 && u < 99) {
      System.out.println("hello");
    } else if (q <= 5) {
      System.out.println("bye");
    } else {
      System.out.println("bootcamp");
    }

    // String
    String s1 = "hello";
    System.out.println(s1.length());

    if (s1.length() > 3) {
      System.out.println("Java");
    } else {
      System.out.println("Python");
    }

    // equals() + if
    String reply1 = "see you again";
    String reply2 = "c u again";

    System.out.println(reply1.equals("see you again"));

    if (reply1.equals("see you again")) {
      System.out.println(reply2);
    } else {
      System.out.println("Error");
    }

    String s3 = "look";

    if (s3.charAt(0) == 'c'){
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    if (s3.charAt(0) == 'c' || s3.charAt(s3.length() - 1) == 'd') {
      System.out.println("yse");
    } else {
      System.out.println("no");
    }

    //switch
    char grade = 'B';
    if (grade == 'A') {
      System.out.println("Grade is A");
    } else if (grade == 'B') {
      System.out.println("Grade is B");
    } else if (grade == 'C') {
      System.out.println("Grade is C");
    } else {
      System.out.println("Fail");
    }

    switch (grade) {
      case 'A':
      System.out.println("Grade is A");
      break;
      case 'B':
      System.out.println("Grade is B");
    }

  }
}
