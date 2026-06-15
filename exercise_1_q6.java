import java.util.*;

class exercise_1_q6 {
    //Q]Write an infinite loop using do while condition.
    /*public static void main(String[] args) {
       
        do{
          System.out.println("hi");  
        }while(true);
    }
    */

    //Q]Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
    public static int power(int x, int n){
        int product =1;
        for(int i=1; i<=n; i++){
            product = product*x;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
 

    
}
