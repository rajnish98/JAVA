public class prime_in_range {
  

  public static boolean isPrime(int n){
    if (n == 2) {
      return true;
    }
    for(int i = 2; i<=Math.sqrt(n); i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }

  public static void primeInRange(int n) {
    for(int i =2; i <= n; i++){
      if (isPrime(i)) {
        System.out.print(i + " ");
        
      }
    }
    System.out.println();
  }

  // binary to decml

  public static void binToDec(int binNum) {
    int myNum = binNum;

    int pow  = 0;
    int decNum = 0;

    while(binNum > 0){
      int lastDigit = binNum % 10;
      decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
      pow++;
      binNum = binNum / 10;

    }    

    System.out.println("decimal of " + myNum + " = " + decNum);
  }



  public static void main(String args[]) {
    // primeInRange(20);
    binToDec(101);
  }
}

