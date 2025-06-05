public class ExceptionExercise4 {

  public static void registerUser(String username, String password, String email) {
    try {
      validateUsername(username);
      validatePassword(password);
      validateEmail(email);
    }
  }
  
}
