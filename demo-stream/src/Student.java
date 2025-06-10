public class Student {
  private Long id;

  public Student

  // // ! Not allowes
  // public String getBookName() {
  //   return name;
  // }

  public class Book { // ! Inner Class
    private String name;
  }

  public Long getOwnerId() {
    return id;
  }

  public static void main(String[] args) {
    Student s1 = new Student();

    Book b1 = s1.new Book();
  }
  
}
