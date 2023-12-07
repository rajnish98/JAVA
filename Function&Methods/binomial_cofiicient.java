public class binomial_cofiicient {
  
  public static int factorial(int n){
    int f = 1;

    for(int i = 1; i <= n; i++){
      f = f * i;
    }
    return f;
  }

  public static int bionomialCoff(int n, int r){
    int fact_n = factorial(n);
    int fact_r = factorial(r);
    int fact_nmr = factorial(n-r);

    int bionomialCoff = fact_n / (fact_r * fact_nmr);
    return bionomialCoff;
  }

  public static void main(String[] args) {
    System.out.println(bionomialCoff(5, 2));
    
  }
}
