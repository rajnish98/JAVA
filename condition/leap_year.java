import java.util.Scanner;

public class leap_year {
  public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year :");
    int leap = sc.nextInt();

    boolean x = ( leap % 4) == 0;
    boolean y = (leap % 100) != 0;
    boolean z = ((leap % 100 == 0) && (leap % 400 == 0));

    if (x && (y || z)) {
      System.out.println("This is a Leap Year");
      
    }else{
      System.out.println("This is not a Leap Year");
    }
  }
}
