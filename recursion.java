import java.util.ArrayList;

public class recursion{

    public static double sqrtHelp(double n, double tolerance, double g){
      if(g*g<(n*(1+tolerance)) && g*g>(n*(1-tolerance))){ //test if guess is correct
        return g;
      }
      else{
        return sqrtHelp(n, tolerance, (n/g + g)/2); //runs the same code but with better guess
      }
    }
    public static double sqrt(double n, double tolerance){
      return sqrtHelp(n, tolerance, 1);
    }

    public static int fibonacciHelp(int n, int numA, int numB) {
      int oldNumB = 0; 
      if (n == 1){        //this is the base cuz if = 0, ill put 0
        return numB;
      }
      else{
        oldNumB = numB;   //save old b before i change it
        numB = numA + numB; 
        if (numB == 1){    //if b is 1, it's 2
          numB = 2;
        }
        numA = oldNumB;   //a becomes oldB because i need it
        return fibonacciHelp(n-1,numA,numB);
      }
    }
    public static int fib(int n){
      if (n == 0){
        return 0;  //0 if n = 0
      }
      else{
        return fibonacciHelp(n, 0, 1);
      }
    }
   
    public static void makeAllSumsH(int n, ArrayList<Integer> l, int a){
      if(n==0){
        l.add(a); 
      }
      else{
        makeAllSumsH(n-1,l,a+n);  //run this but add to a and again without adding. Also minus n
        makeAllSumsH(n-1,l,a);
      }
    } 
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> list = new ArrayList<Integer>();
      makeAllSumsH(n,list,0);
      return list;
    }
  
    public static void main(String[] args) {
                      //fib test
    /*System.out.print(""+ fib(0) + "    ");     
      System.out.print(""+ fib(1) + "    ");    
      System.out.print(""+ fib(2)  + "    ");    
      System.out.print(""+ fib(3)  + "    ");    
      System.out.print(""+ fib(4)  + "    ");   
      System.out.print(""+ fib(5)  + "    ");*/ 
                      //makeAllSums test
    /*ArrayList<Integer> test = new ArrayList<Integer>();
      test = makeAllSums(3);
      for (int i = 0; i<test.size(); i++){
        System.out.println(test.get(i));
      }*/
      System.out.println(""+ sqrt(4,.001));    
    }
}