import java.util.*;

class exercise_1_q2 {
    //Q]Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOfOddNumbers(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum = sum;
            }
            else{
                sum=sum+i;
            }
        }
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumOfOddNumbers(n);

        System.out.println(sum);
    }


    
}
