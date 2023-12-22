import java.util.Scanner;

public class sum_of_digit {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("input an integer");
    int digit = sc.nextInt();
    System.out.println("The sum is " + sumDigits(digit));
  }
  public static int sumDigits(int n){
    int sumOfDigits = 0;
    while ( n > 0) {
      int lastDigit = n % 10;
      sumOfDigits += lastDigit;
      n /= 10;
    }
    return sumOfDigits;
  }
}
