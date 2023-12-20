import java.util.Scanner;

public class average {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    double x = sc.nextDouble();
    System.out.println("Enter the Second number");
    double y = sc.nextDouble();
    System.out.println("Enter the Third number");
    double z = sc.nextDouble();
    System.out.println("The average of value is : " + average(x,y,z)+ "\n");
  }

  public static double average(double x, double y, double z){
    return (x+y+z) / 3;
  }
}
