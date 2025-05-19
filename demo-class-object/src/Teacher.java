public class Teacher {
  private Candy[] candies;

  public Teacher(Candy[] candies) {
    this.candies = candies;
  }

  public void distribute(Student[] students) {
    int count = candies.length;
    boolean completed = false;
    while (count >= 0) {
      for (int i = 0; i < students.length; i++) {
        if (--count < 0) {
          completed = true;
          break;
        }
        distribute(students[i], candies[count]);
        this.candies[count] = null;
      }
      if (completed) {
        break;
      }
    }
  }

  public void distribute(Student student, Candy candy) {
    student.receive(candy);
  }

  public static void main(String[] args) {
    // Distribute 20 candy to 3 Students
    Candy c1 = new Candy("RED", 3);
    Candy c2 = new Candy("BLUE", 4);
    Candy c3 = new Candy("YELLOW", 10);
    Candy c4 = new Candy("RED", 100);
    Candy c5 = new Candy("BLUE", 23);
    Candy c6 = new Candy("YELLOW", 25);
    Candy c7 = new Candy("RED", 28);
    Candy c8 = new Candy("RED", 10);
    Candy c9 = new Candy("YELLOW", 23);
    Candy c10 = new Candy("BLUE", 5);
    Candy c11 = new Candy("RED", 10);
    Candy c12 = new Candy("YELLOW", 23);
    Candy c13 = new Candy("BLUE", 6);
    Candy c14 = new Candy("YELLOW", 1);
    Candy c15 = new Candy("BLUE", 2);
    Candy c16 = new Candy("YELLOW", 100);
    Candy c17 = new Candy("RED", 99);
    Candy c18 = new Candy("RED", 8);
    Candy c19 = new Candy("YELLOW", 23);
    Candy c20 = new Candy("BLUE", 4);
    Candy[] candies = new Candy[] {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11,
        c12, c13, c14, c15, c16, c17, c18, c19, c20};
    Teacher teacher = new Teacher(candies);

    Student[] students =
        new Student[] {new Student(), new Student(), new Student()};
    teacher.distribute(students);

    System.out.println(students[0].numberOfCandy());
    System.out.println(students[1].numberOfCandy());
    System.out.println(students[2].numberOfCandy());
    
    System.out.println(students[0].getTotalNumbers());
    System.out.println(students[1].getTotalNumbers());
    System.out.println(students[2].getTotalNumbers());
    
    // Every Student has his own candies.
    // print out the candy (color, number) of every students

    // Use loop to distribute candy

    // Teacher.java -> distribute
    // Student -> receive(Candy candy)
  }
}