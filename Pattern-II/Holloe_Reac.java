public class Holloe_Reac {

  public static void hollow_rrectangel(int totRows, int totCols){
    // outer loop
    for (int i = 1; i<=totRows; i++) {
      // inner loop
      for (int j=1; j<=totCols; j++) {
        //  cell - (i, j)
        if (i == 1 || i == totRows || j == 1 || j == totCols) {
          // boundary cells

          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
      
    }
  }

  public static void main(String args[]) {
    hollow_rrectangel(4, 5);
  }
}