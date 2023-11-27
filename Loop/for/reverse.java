import java.util.Scanner;

public class reverse {
  public static void main(String args[]) {
    // Scanner SC = new Scanner(System.in);
    // int n = SC.nextInt();
    // int revenum = 0;
    // while (n > 0) {
    //   int lastdigit = n % 10;
    //   n = n / 10 ;
    //   revenum = (revenum * 10) + lastdigit;
    //   System.out.print(lastdigit);
    //  }
    // method 2---------------------

      int n = 10897;
      while (n > 0) {
        int lastDigit = n % 10;
        System.out.print(lastDigit);
        n /= 10;
      }
      System.out.println();
 
  }
}
