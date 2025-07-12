import java.util.*;

public class binomial{
    public static int factorialOfN(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int findBinomial(int n, int r){
          int fact_n = factorialOfN(n);
          int fact_r = factorialOfN(r);
          int fact_nmr = factorialOfN(n - r);

          int findBinomial = fact_n / (fact_r * fact_nmr);
          return findBinomial;
    }

    public static void main(String args[]){
        System.out.println(findBinomial(5, 2));
    }
}