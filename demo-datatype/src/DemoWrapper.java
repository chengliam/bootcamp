public class DemoWrapper {
    public static void main(String[] args) throws Exception {
        // 8 Prmitives
        // int -> Integet

        int x = 3;
        Integer x1 = 3;

        byte b = 4;
        Byte b1 = 4;

        short s = 9;
        Short s1 = 9;

        long l = 8L;
        Long l1 = 8L;

        char c = 'a';
        Character c1 = 'a';

        boolean n = true;
        Boolean n1 = true;

        float f = 1.03f;
        Float f1 = 1.03f;

        double d = 1.99;
        Double d1 = 1.99;

        String s2 = "hello";

        // Primitives vs Wrapper Class
        // 1. Primitives for value storage and Math Operation ONLY.
        // 2. Wrapper Class has methods
        // 3. Wrapper Class NEVER use Math Operatiors
        System.out.println(x1.doubleValue());
        System.out.println(x + x1);
        Integer x2 = 10;
//
        // Value Comparison
        System.out.println(x2.compareTo(x1));
        Integer x3 = 10;
        System.out.println(x2.compareTo(x3));
        System.out.println(x1.compareTo(x2));
        System.out.println(x2.equals(x1));
    }
}
