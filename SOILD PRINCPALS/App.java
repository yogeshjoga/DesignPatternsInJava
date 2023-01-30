public class App {
  // dimond pattren in java?
  public static void main(String[] args) {
    int n = 10;

    for (int i = 0; i <= (n / 2 + 1); i++) {
      for (int j = 1; j <= n - i; j++) System.out.print(" ");
      for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
      System.out.print("\n");
    }

    // N/2
    for (int i = n / 2 - 1; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) System.out.print(" ");
      for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
      System.out.print("\n");
    }
  }









}
