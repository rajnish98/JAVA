public class callbyValue {
  public static void main(String args[]) {
    // swaping - value exchange

    int a = 5;
    int b = 10;

    // swap

    int temp = a;
    a = b;
    b = temp;


    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}

