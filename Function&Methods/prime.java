public class prime {
  public static boolean isPrime(int n){
    // conrner case
    // 2
    if(n == 2){
      return true;
    }
    // boolean isPrime = true;
    for(int i = 2; i<=n-1; i++){
      if (n % i == 0) {
        // isPrime = false;
        // break;
        return false;
      }
    }
    // return isPrime;
    return true;
  }

  public static void main(String args[]) {
    System.out.println(isPrime(5));
  }
}
