import java.util.Scanner;

public class area_of_circle {
  public static void main(String args[]){
    Scanner SC = new Scanner(System.in);
    float rad = SC.nextFloat();
    float AOC = 3.14f * rad * rad;
    System.out.println(AOC);

  }
}
