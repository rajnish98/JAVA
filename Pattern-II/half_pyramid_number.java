public class half_pyramid_number {
  public static void half_pyr_num(int n){
    for (int i=1; i<=n; i++){
      // inner - number
      for (int j=1; j <=n-i+1; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
  public static void main(String arg[]){
    half_pyr_num(5);
  }
}