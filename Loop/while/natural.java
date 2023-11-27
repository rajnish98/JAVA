import java.util.Scanner;

public class natural {
  public static void main(String args[]) {
    Scanner SC = new Scanner(System.in);
    int n  = SC.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= n) {
      sum += i;
      i++;
      System.out.print(sum + " ");
    }
    System.out.println();
  }
}
