import java.util.*;

class bitManipulationQuestions {

    public static int getBit(int m, int bitMask){
        if((bitMask & m)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q]Write a program to find if a number is a power of 2 or not.
        System.out.println("Q1]Write a program to find if a number is a power of 2 or not.");
        System.out.println("enter the number which is to be checked");
        int n = sc.nextInt();
        if(n>0 && (n&(n-1))==0){
            System.out.println("number is power of 2");
        }
        else{
            System.out.println("number is not power of 2");
        }

        //Q2] toggle a bit at postion = "pos" of int m
        System.out.println("Q2]Write a program to toggle a bit a position = “pos” in a number “M”");
        System.out.println("enter the integer whose bit is to be toggele");
        int m = sc.nextInt();
        System.out.println("enter the postion of the bit");
        int pos = sc.nextInt();
        int i = pos -1 ; //index of the position
        int bitMask = 1<<i;
        int initialValueOfBit = getBit(n, bitMask);
        if(initialValueOfBit == 0){
            int newNumber = (bitMask | m);
            System.out.println(newNumber);
        }
        else{
            int newBitMask = (~bitMask);
            int newNumber2 = (newBitMask & m );
            System.out.println(newNumber2);
        }

        //toggle function can also be easily performed using XOR but doing bitMask ^ m

        //q3]Write a program to count the number of 1’s in a binary representation of the number.
        System.out.println("Q3] Write a program to count the number of 1s in a binary representation of the number.");
        
    



    }
    
}
