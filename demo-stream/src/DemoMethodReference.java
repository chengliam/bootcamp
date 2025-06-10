import java.util.function.Supplier;

public class DemoMethodReference {

  public static void main(String[] args) {
    String name = "John";

    // lambda expression
    Supplier<Integer> lengthSupplier = () -> name.length();
    int length = lengthSupplier.get();

    // method referenc
    Supplier<Integer> lengSupplier2 = name::length; // variable.intancaMethod()
    int length2 = lengSupplier2.get();

    String s = "hello";
    // int result = s::length; // ! It is not a formula

    
  }
  
}
