import java.util.ArrayList;

public class recursion{

    public static double sqrtHelp(double n, double tolerance, double g){
      if(g*g>(n*tolerance) && g*g<(n*(1-tolerance))){
        return g;
      }
      else{
        return sqrtHelp(n, tolerance, (n/g + g)/2);
      }
    }  
    public static double sqrt(double n, double tolerance){
      return sqrtHelp(n, tolerance, 1);
    }

    public int fibonacciHelp(int n, int ans) {
      if (n == 0){
        return 0;
      }
      if (n == 1){
        return 1;     //NEED BASE CASE + NEED COUNTER?
      }
      else{
        ans = ans-1 + ans-2;
        return fibonacciHelp(n,ans);
      }
    }

    public static int fib(int n){
      return fibonacciHelp(n, 0);
    }

    /*As Per classwork*/
 //   public static ArrayList<Integer> makeAllSums(){
   // }

}