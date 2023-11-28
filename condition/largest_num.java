public class largest_num {
  public static void main(String args[]) {
    int a = 1, b = 3, c = 6;

    if(a >= b && a >= c){
      System.out.println("A is largest" + " " + a);
    }
    else if(b >= c){
      System.out.println("B is largest" + " " + b);
    }
    else{
      System.out.println("C is largest" +" "  + c);
    }
  }
}
