public class DemoLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    // 2^3

    // ! For Loop
    // for (initialization; continue condition; modifier)
    // Step 1: i = 0
    // Step 2: check if i < 3
    // Step 3: yes, print hello
    // Step 4: i + 1
    // Step 5: check if i < 3
    // Step 6: yes, print hello
    // Step 7: i + 1
    // Step 8: check if i < 3
    // Step 9: yes, print hello
    // Step 10: i + 1
    // Step 11: check if i < 3
    // Step 12: No -> exit loop

    for (int i = 0; i < 3; i++) { // i=0,1,2
      System.out.println("hello");
    }

    // 2^10
    int y = 2;
    for (int i = 0; i < 9; i++) { // i=0,1,2,3,4,5,6,7,8
      y = y * 2;
    }
    System.out.println(y); // 1024

    // for + if
    // Print even numbers between 0 - 10
    // even number -> x % 2 == 0
    for (int i = 0; i < 11; i++) { // i=0,1,2,3,4,5,6,7,8,9,10
      if (i % 2 == 0) { // even number
        System.out.println(i);
      }
    }

    // for + if
    // Print the char index of 'm', if found, print the index; if not found, print -1
    String s2 = "bootcamp";
    int index = -1;
    for (int i = 0; i < s2.length(); i++) { // i=0,1,2,3,4,5,6,7
      if (s2.charAt(i) == 'm') {
        index = i;
      }
    }
    System.out.println(index);

    // ! break + LOOP
    // Find the first character of 'a' in a given String, print the index of the character.
    String str = "character";
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a') {
        System.out.println(i); // 2
        break; // break the whole loop (stop the loop, exit the loop)
      }
    }

    // Find the first 3 character of 'a' in a given String
    String ss = "abcdeabcdeabcdeabcdeabcde";
    int counter = 0;
    for (int i = 0; i < ss.length(); i++) {
      if (ss.charAt(i) == 'a') { // 0,1,2
        if (counter >= 3) {
          break;
        }
        System.out.println(i);
        counter++;
      }
    }

    // ! continue + Loop
    // Print all index of character 'a' in a given String
    String ss2 = "abcabcabc";
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) == 'a') {
        System.out.println(i);
      }
    }
    for (int i = 0; i < ss2.length(); i++) {
      if (ss2.charAt(i) != 'a') {
        continue; // skip the rest of code lines, and then goes to next iteration
      }
      System.out.println(i);
    }

  }
}