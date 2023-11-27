import java.util.Scanner;

public class prime {
  public static void main(String args[]) {
    Scanner SC = new Scanner(System.in);
    int n  = SC.nextInt();
    // int count = 1;
    int i = 2;
    if (n % i == 0) {
      System.out.println( n + " " + "This is prime number");
      // count++;
    }
    else{
      System.out.println(n + " " + "This is not a prime number");
    }
  }
}
