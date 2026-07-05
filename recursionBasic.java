import java.util.*;
class recursionBasic {  
    //1. 
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printNum(n-1);
    }

    //2.
    public static void printAscNum(int m){
        if(m==6){
            return;
        }
        System.out.print(m);
        printAscNum(m+1);
    }

    //3.
    public static void getSum(int x, int i, int sum){
        if(i>x){
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        getSum(x, i+1, sum);   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.print numbers from 5 to 1
        int n = 5;
        printNum(n); //n=5

        System.out.println("\n");

        //2.print numbers from 1 to 5
        int m = 1;
        printAscNum(m); //m=1

        System.out.println("\n");

        //3.print sum of first x natural numbers
        System.out.println("enter x to get sum of first x naturat numbers ");
        int x = sc.nextInt();
        int i = 1;
        int sum = 0;
        getSum(x,i,sum);

        System.out.println("\n");

        //4.
        

    } 
}
