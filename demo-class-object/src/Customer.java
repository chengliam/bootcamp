// Customer has many orders
public class Customer {
  private long id;
  private String name;
  private Order[] orders;

  public void setCustomerInfo(String customerName, long customerID) {
    this.id = customerID;
    this.name = customerName;
  }

  public String getName() {
    return this.name;
  }

  public long getId() {
    return this.id;
  }
  
  public Customer() {
    this.orders = new Order[0];
  }

  public void addOrder(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  }

  public boolean isVIP() {
    double total = 0.0;

    if (this.order[i].checkoutAmount >= 100_000) {
      return "Is VIP"
    } else {
      return "Is Not VIP"
    }
  }


  // main()
  // John -> many Orders -> items
  
  // isVIP():
  // total amount of orders > 100_000
  public static void main (String[] args) {
    Customer c1 = new Customer();
    c1.setCustomrInfo

  }
}