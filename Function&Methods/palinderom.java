import java.util.Scanner;

public class palinderom {

  public static void main(String args[]){
System.out.println("Please Enter a Number : ");
Scanner sc = new Scanner(System.in);
int palind = sc.nextInt();

if (isPalindrome(palind)) {
  System.out.println("Number : " + palind + " is a palindrome");
}else{
  System.out.println("Number : " + palind + " is not palindrom");
}
 }
  public static boolean isPalindrome(int number){
  int palind = number; // copied number into variable
  int reverse  = 0;
  
  while (palind != 0 ) {
    int remainder = palind % 10;
    reverse = reverse * 10 + remainder;
    palind = palind / 10;
  }
  // if original and the reverse of number is equal means
  // number is palindrome in java

  if (number == reverse) {
    return true;
  }else{
    return false;
  }
}
}