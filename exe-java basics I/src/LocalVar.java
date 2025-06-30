public class LocalVar {
    public static void main (String[] args) {
        // byte 係一個可以儲存數值 -128 至 127 嘅種類
        byte b1 = -128;
        System.out.println(b1);
        byte b2 = 127;
        System.out.println(b2);

        // short 係一個可以儲存數值 -32,768 至 32,767 嘅種類
        short s1 = -32768;
        System.out.println(s1);
        short s2 = 32767;
        System.out.println(s2);

        // int 係一個可以儲存數值 -2,147,483,648 至 2,147,483,647 嘅種類
        int i1 = -2147483648;
        System.out.println(i1);
        int i2 = 2147483647;
        System.out.println(i2);

        // long 係一個可以儲存數值 -9,223,372,036,854,775,808 至 9,223,372,036,854,775,807 嘅種類
        long l1 = -9223372036854775808L;
        System.out.println(l1);
        long l2 = 9223372036854775807L;
        System.out.println(l2);

        // double 係一個可以儲存有小數點數值嘅種類，其大小與 long 相同
        double d1 = -9999999.999;
        System.out.println("d1 " + d1);
        double d2 = 9223372.03685477;
        System.out.println("d2 " + d2);

        // float 係一個可以儲存有小數點數值嘅種類，其大小比 double 小，但與 int 相同
        float f1 = -214748.39f;
        System.out.println("f1 " + f1);
        float f2 = 214748.36f;
        System.out.println("f2 " + f2);

        // char 係一個可以儲存獨立字符，如果輸入數字會顯示該數字對應的字符，由 0 至 65535
        char c1 = 'A';
        System.out.println(c1);
        char c2 = 19999;
        System.out.println(c2);

        // boolean 係一個儲存是或否數值嘅種類一般會以 isXXX 命名
        boolean isEN = true;
        System.out.println(isEN);
        boolean isZH = false;
        System.out.println(isZH);

        // 未分配數值的種類無法顯示，會 error
        // For example
        int example;
        // System.out.println(example); <-- Error
        example = 123;
        System.out.println(example); // <-- OK

        int number = 1; // `1` is treated as an `int` by default
        double decimal = 10.0; // `10.0` is treated as a `double` by default
        double decimal2 = 10.0d;
        float floatValue = 0.0f; // `0.0f` explicitly specifies a `float` literal
        long bigNumber = 10000000000L; // `10000000000L` indicates a `long` literal
        byte smallNumber = 10; // `10` fits within the range of a `byte` and is treated as an `int`
        System.out.println(number);
        System.out.println(decimal);
        System.out.println(decimal2);
        System.out.println(floatValue);
        System.out.println(bigNumber);
        System.out.println(smallNumber);
        System.out.println("Done");
    }

}
