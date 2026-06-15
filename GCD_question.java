import java.util.*;
//Q]Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.Scanner;

class GCD_question {

    public static int findGCD(int a , int b){
        int smaller;
        if(a>b){
            smaller = b;
        }
        else{
            smaller = a;
        }
        for(int i=smaller; i>=1; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
            
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a, b));

    }

    
}

/*
logic for interviews-

public static int findGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

*/
