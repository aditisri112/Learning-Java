import java.util.*;

class exercise_1_q3 {
    //Q]Write a function which takes in 2 numbers and returns the greater of those two

    public static int greaterNum(int a, int b){
        int ans = 0;
        if(a>b){
            ans = a;
        }
        else if(b>a){
            ans = b;
        }
        else{
            System.out.println("both are equal");
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater = greaterNum(a, b);
        System.out.println(greater);
    }
    
}
