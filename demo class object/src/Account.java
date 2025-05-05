public class Account {
  // Attributes
  private String userId;
  private double balance;

  // ! Can be more than 1 constructors
  // Constructor
  public Account() { // empty constructor (no parameter)
    // empty constructor implicitly exists
    this.balance = 10.0;
  }

  // Technically OK
  // public Account(String userId) {
  //   this.userId = userId;
  // }

  // All arguments constructor (All parameters)
  public Account (String userId, double balance) {
    this.userId = userId;
    this.balance = balance;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  //! write
  public void setBalance(double balance) {
    this.balance = balance;
  }

  //! read
  public double getBalance() {
    return this.balance;
  }

  public static void main(String[] args) {
    Account[] accounts = new Account[3];
    Account a1 = new Account();
    Account a2 = new Account();
    a2.setBalance((800.0));
    Account a3 = new Account();
    accounts[0] = a1;
    accounts[1] = a2;
    accounts[2] = a3;

    System.out.println(accounts[1].getBalance());
    // System.out.println(account[0].get);
  }
  
}
