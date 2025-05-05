public class Tutor {
  public static void main(String[] args) {
    // object reference
    // "new" -> create an object of Account
    Account a1 = new Account();
    a1.setBalance(100.0);
    System.out.println(a1.getBalance());

    Account a2 = new Account();
    a2.setBalance(200.0);
    System.out.println(a2.getBalance());

    a2 = a1;
    a2.setBalance(500.0);
    System.out.println(a1.getBalance());
    System.out.println(a2.getBalance());
  }
}
