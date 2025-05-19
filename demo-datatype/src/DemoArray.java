import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // problem
    String BB = "---------------------------------------------";
    int x = 2;
    int x2 = 8;
    int x3 = 1000;
    System.out.println(x);
    System.out.println(x2);
    System.out.println(x3);

    // Array
    // ! Store a set of same type of values
    // For example, a set of int values
    // 3 -> three places to store int values
    int[] arr =new int[3];
    // write value into array
    // 0 represents the first place of the array
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 1000;
    // arr[3] = 10; error, array length 3, so you cannot access the 4th place

    // ! read value from array
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println(BB);

    // Q1: declare double array --> 4 values
    //1.1, 9.2, -9.8, 77.9
    // print them out

    double[] dou = new double[4];
    dou[0] = 1.1;
    dou[1] = 9.2;
    dou[2] = -9.8;
    dou[3] = 77.9;
    System.out.println(dou[0]);
    System.out.println(dou[1]);
    System.out.println(dou[2]);
    System.out.println(dou[3]);
    System.out.println(BB);

    for (int i = 0; i< dou.length; i++) {
      System.out.println(dou[i]);
    }

    System.out.println(BB);

    // String[]
    String[] arr3 = new String [3];
    arr3[0] = "abc";
    arr3[0] = "def";
    arr3[0] = "bootcamp";

    String[] arr4 = new String [] {"abc", "def", "bootcamp"};
    // for loop
    for (int i = 0; i < arr4.length; i++) {
      System.out.println(arr4[i]);
    }
    // for loop + if (filtering)
    // find the string in the array, which length > 4
    for (int i = 0; i <arr4.length; i++) {
      if (arr4[i].length() > 4) {
        System.out.println(arr4[i]);
      }
    }

    // for loop + if (and / or)
    // print the strings in the array, which length > 4 and starts with 'b'
    for (int i = 0;i < arr4.length; i++) {
      if (arr4[i].length() > 4 && arr4[i].startsWith("b")) {
        System.out.println(arr4[i]);
      }
    }
    // print the string in the array, which length = 3 or and end with 'p'
    for (int i = 0;i < arr4.length; i++) {
      if (arr4[i].length() == 3 || arr4[i].endsWith("p")) {
        System.out.println(arr4[i]);
      }
    }

    int[] arr5 = new int[] {4, 7, -3, 1500, -100, 1000};
    int box = arr5[0];
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > box) {
        box = arr5[i];
      }
    }
    System.out.println(box);

    int min = arr5[0];
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] < min) {
        min = arr5[i];
      }
    }
    System.out.println(min);

    // swap
    int a = 6;
    int b = 8;
    int c = a;
    int backup = a;
    a = b;
    b = c;
    System.out.println(a);
    System.out.println(b);

    int [] arr6 = new int [] {9, 7, 10, -3, 8};
    for (int i = 0; i < arr6.length - 1; i++) {
      if (arr6[i] > arr6[i + 1]) {
        backup = arr6[i];
        arr6[i] = arr6 [i + 1];
        arr6[i + 1] = backup;
      }
    }
    System.out.println(Arrays.toString(arr6));

    arr6 = new int [] {9, 7, 10, -3, 8};
    for (int i = 0; i < arr6.length - 1; i++) {
      for (int j = 0; j < arr6.length - 1 - i; i++) {
        if (arr6[j] > arr6[j + 1]) {
          backup = arr6[j];
          arr6[j]= arr6[j + 1];
          arr6[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(arr6));

  }
  
}
