public class floyds_triangle {
  public static void floyd_trang(int n){
    int counter=1;
    // inner 
    for (int i=1; i<=n; i++){
      // counter
      for (int j=1; j<=i; j++){
        System.out.print(counter+" ");
        counter++;
      }
      System.out.println();
    }
  }
  public static void main(String args[]) {
    floyd_trang(5);
  }
}
