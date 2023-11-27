import java.util.Scanner;

public class input {
  public static void main(String args[]){
  
    Scanner SC = new Scanner(System.in);
    // String input = SC.next();  //only store the first word it does not store space and also does not store next word after space.
    // System.out.println(input);

    String name = SC.nextLine();
    System.out.println(name);

    int number = SC.nextInt();
    System.out.println(number);

    float price =SC.nextFloat();
    System.out.println(price);

    Double pr = SC.nextDouble();
    System.out.println(pr);

    Boolean bl = SC.nextBoolean();
    System.out.println(bl);

    short sh = SC.nextShort();
    System.out.println();

    long lg = SC.nextLong();
    System.out.println(lg);

  }
}
