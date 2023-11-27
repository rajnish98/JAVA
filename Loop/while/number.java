import java.util.Scanner;

public class number {
  public static void main(String args[]) {
    Scanner SC = new Scanner(System.in);
    int n  = SC.nextInt();
    int count = 1;

    while (count <= n) {
      System.out.print(count + " ");
      count++;
      
    }
    System.out.println();
  }
}
