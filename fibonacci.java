import java.util.*;
/*
Q]Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
*/
import java.util.Scanner;

class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
         System.out.print(a + " ");

         int next = a + b;
         a = b;
         b = next;

    }
}
    
}
