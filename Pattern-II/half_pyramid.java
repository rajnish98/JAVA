public class half_pyramid {

  public static void half_pyra(int n){
    // outer loop
    for (int i=1; i<=n; i++) {
      // space
      for (int j=1; j<=n-i; j++) {
        System.out.print(" ");
      }
        // stars
        for (int j=1; j<=i; j++) {
          System.out.print("*");
        }
       System.out.println(); 
    }
  }
  public static void main(String args[]) {
    half_pyra(4);
  }
}
