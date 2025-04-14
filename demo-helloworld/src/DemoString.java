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
    System.out.println(name.charAt(0));
    System.out.println(name.charAt(name.length()/2));
    System.out.println(name.charAt(name.length()/2-1));
    System.out.println(name.charAt(name.length()/2+1));
    System.out.println(name.charAt((name.length()/2)-1));


  }
  
}
