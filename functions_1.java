import java.util.*;

 class functions_1 {
    /*  
    Q] function to print name
    public static void printName(String name) {
        System.out.println(name);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printName(name); //call to function
      }
        */

      /*
      Q] function to calculate sum and reurn sum
      public static int printSum(int a, int b) {
        int sum = a+b;
        return sum ;
      }

      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = printSum(a, b);

        System.out.println(sum);
      }
        */

      /*
      Q] calculate product using function and return product
      public static int calculateProduct(int a, int b){
        int product = a*b; 
        return product;
      }

      public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a,b);

        System.out.println(product);
      }
        */

    public static void calculateFactorial(int n){
        int factorial = 1;
        if(n<0){
            System.out.println("invalid");
            return; //by this if n<0 the loop will not be executed
        }
        else{
            for(int i=n; i>=1; i--){
                factorial = factorial*i;

            }
            System.out.println(factorial);
        }
     
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);5
        
    }
   
}
