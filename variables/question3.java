import java.util.Scanner;

public class question3 {
  
  public static void main(String args[]) {

    Scanner SC = new Scanner(System.in);

    float pencil = SC.nextFloat();
    float pen = SC.nextFloat();
    float eraser = SC.nextFloat();

    float total = pencil + pen + eraser;

    System.out.println("total cost : " + total);

    float newTotal = total + (0.18f * total);
    System.out.println("after 18% gst: " + newTotal);

    
  }
}
