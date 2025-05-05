public class DemoLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    // 2^3

    // 2^10
    // !for loop
    // for (initialization; continue condition; modifier)
    for (int i = 0; i < 3; i++){
      System.out.println("hello");
    }

    int y = 2;
    for (int i = 0; i <9; i++) {
      y = y * 2;
    }
    System.out.println(y);

    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // for + if
    // print the char index of 'm', if found, print the index; if not found, print -1

    String s2 = "bootcamp";
    int index = -1;
    
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == 'm') {
        index = i;
      }
    }
    System.out.println(index);

    // break
    // find the first charactere of 'a' in a given String
    String str = "character";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        System.out.println(i);
        break;
      }
    }

    // Find the first 3 'a' in a given String
    // New function "counter"
    String ss = "abcabcabcabc";
    int counter = 0;
    for (int i = 0; i < ss.length(); i++) {
      if (ss.charAt(i) == 'a') {
        if (counter >= 3) {
          break;
        }
        System.out.println(i);
        counter++;
      }
    }

    String BB = "Break------------------------------";
    System.out.println(BB);


    // ! continue + Loop
    // print all index of character 'a' in a ginven String
    String ss2 = "abcabcabc";
    for (int i = 0; i < ss2.length(); i++){
      if (ss.charAt(i) == 'a') {
        System.out.println(i);
      }
    }
    for (int i = 0; i < ss2.length(); i++) {
      if (ss.charAt(i) != 'a'){
        continue;
      }
      System.out.println(i);
    }

  }
}
