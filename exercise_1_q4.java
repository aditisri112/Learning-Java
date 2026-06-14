import java.util.*;

class exercise_1_q4 {
   //Q]Write a function that takes in the radius as input and returns the circumference of a circle.
   public static double getCircumference(int r){
    double circum = 2*(3.14)*r;
    return circum;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    double circum = getCircumference(r);
    System.out.println(circum);
   }

    
}
