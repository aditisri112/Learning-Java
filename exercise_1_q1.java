import java.util.*;
class exercise_1_q1 {
    //Q]Enter 3 numbers from the user & make a function to print their average.

    public static void printAverage(int a, int b, int c){
        int average = (a + b + c)/3;
        System.out.println(average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printAverage(a, b, c);
    }
    
}
