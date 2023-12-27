public class soidRhombus {
   public static void solidRho(int n){
    // for line
    for (int i =1; i <=n; i++) {
      // space n-i
       for (int j=1; j<=(n-i); j++) {
        System.out.print(" ");
      }
      // star 
      for (int j=1; j <=n; j++) {
        System.out.print("*");
      }
     System.out.println();
    }
   }
   public static void main(String args[]) {
    solidRho(5);
   }
}
