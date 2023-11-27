public class arithmetic {

  public static void main(String args[]) {
    int a = 10;
    int b = 5;
    // int b = ++a;
    // int b = a++;
    // int b = --a;
    // int b = a--;
    // System.out.println("modulo: " + (a%b));
    // System.out.println(b);

    // unary oprator
    System.out.println(a);

    //rational oprator ------------------------------

    System.out.println(a == b);
    System.out.println(a != b);    
    System.out.println(a > b);    
    System.out.println(a < b);    
    System.out.println(a >= b);    
    System.out.println(a <= b);    

    //logical oprator ----------------------------------------
   System.out.println((3>2) && (5>0)); // both are true than output will true

   System.out.println((3>2) || (6>6));

   System.out.println(!(5>0));
   
  //  Assignment oprator------------------------------

  a = b;
  a += 5;
  a -= 5;
  a *= 5; 
  a /= 5;
  a %=5;
  System.out.println(a);


  }
}