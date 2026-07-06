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

    //4.
    public static void getFactorial(int z, int prod){
        if(z<=0){
            System.out.println(prod);
            return;
        }
        prod = prod*z;
        getFactorial(z-1, prod);
    }

    //5.
    public static void getFibonacciSeries(int f, int g, int p){
        if(p == 0){
            return;
        }
        int k = f+g;
        System.out.print(k);
        getFibonacciSeries(g, k, p-1);
    }

    //6.
    public static int getPower(int l, int u){
        if(u==0){
            return 1;
        }
        if(l==0){
            return 0;
        }
        int powmo = getPower(l , u-1);
        int pow = l * powmo;
        return pow;
    }

    //7.
     public static int getPow(int e, int r){
        if(r==0){
            return 1;
        }
        if(e==0){
            return 0;
        }
        if(r%2==0){
            return getPow(e, r/2)*getPow(e, r/2);
        }
        else{
            return getPow(e, r/2)*getPow(e, r/2)*e;
        }
        
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

        //4.print facorial of number z
        System.out.println("enter number z whose factorial you want");
        int z = sc.nextInt();
        int prod =1;
        getFactorial(z, prod);

        System.out.println("\n");

        //5.Print the fibonacci sequence till pth term.
        System.out.println("enter the number if termms for fibonacci series");
        int p = sc.nextInt();
        int f = 0;
        int g = 1;
        System.out.println(f);
        System.out.println(g);
        getFibonacciSeries(f, g, p-2);

        System.out.println("\n");

        //6.Print l^u (with stack height = n)
        System.out.println("enter number whose power you want");
        int l = sc.nextInt();
        System.out.println("enter the power you want");
        int u = sc.nextInt();
        int ans = getPower(l, u);
        System.out.println(ans);

        System.out.println("\n");

        //7. Print x^n (with stack height = logn)
        System.out.println("enter number whose power you want");
        int e = sc.nextInt();
        System.out.println("enter the power you want");
        int r = sc.nextInt();
        int answer = getPow(e, r);
        System.out.println(answer);
        
    } 
}
