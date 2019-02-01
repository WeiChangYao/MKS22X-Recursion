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
      
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
    }

}