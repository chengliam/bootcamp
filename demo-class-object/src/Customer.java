// Customer has many orders
public class Customer {
  private long id;
  private String name;
  private Order[] orders;

  public Customer() {
    this.orders = new Order[0]; // array object
  }

  public String getName() {
    return this.name;
  }

  public long getId() {
    return this.id;
  }

  public void add(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  }

  // main()
  // John -> many Orders -> items

  // isVIP():
  // total amount of orders > 100_000

  // bigdecimal
  public boolean isVIP() {
    double total = 0.0;
    for (int i = 0; i < this.orders.length; i++) {
      total += this.orders[i].checkoutAmount();
    }
    // if (total > 100_000) {
    // return true;
    // }
    // return false;
    return total > 100_000;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Customer c1 = new Customer(); // "new" -> calling, "Customer()" constructor
    c1.setName("John");

    Item itemA = new Item(21000, 2);
    Item itemB = new Item(20000, 3);
    Order orderA = new Order(itemA);
    orderA.add(itemB);
    c1.add(orderA);
    System.out
        .println("Customer " + c1.getName() + ", VIP status: " + c1.isVIP()); // true / false

  }
}