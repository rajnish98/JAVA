import java.util.Scanner;

/**
 * question1
 */
public class question1 {

  public static void main(String args[]) {
    try (Scanner SC = new Scanner(System.in)) {
      int A = SC.nextInt();
      int B = SC.nextInt();
      int C = SC.nextInt();

      int Average = A + B + C / 3;

      System.out.println("average is : " + Average);
    }
    
    
  }
}