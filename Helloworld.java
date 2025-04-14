public class Helloworld {

  public static void main(String[] args) {
    System.out.println("Hi there, this is Liam");


    byte b1 = 3;
    short s1 = 3;
    int i1 = 3;
    long l1 = 3;

    // byte (-128 to 127)
    // short (-32_767 to - 32_767)
    // int (-2_147_483_647 to 2_147_483_647)
    // long ()

    i1 = 2_147_483_647;
    i1 = i1 + 1;
    System.out.println(i1);
    // = -2_147_483_647

    // 1. prepare a long value 2.2 Billion
    // 2. assign a value into long variable
    l1 = 2_200_000_000L;
    l1 = l1 + 2_200_000_000L;
    System.out.println(l1);

    // long + int = long +long = long OK
    // 

  }
}