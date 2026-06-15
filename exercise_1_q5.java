import java.util.*;

class exercise_1_q5 {
    //Q] Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static String eligiblity(int age){
        String verdict;
        if(age>18){
            verdict = "eligible";
            
        }
        else{
            verdict = "not eligible";
        }

        return verdict;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String eligible = eligiblity(age);

        System.out.println(eligible);
    }

    
}
