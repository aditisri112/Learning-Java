import java.util.*;

class string_and_stringbuilder_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q]reverse string
        System.out.println("Q.1] Reverse string");
        System.out.println("enetr the string to be reversed");
        String original = sc.nextLine();
        for(int i=original.length()-1; i>=0; i--){
            System.out.print(original.charAt(i));
        }
    }
    
}
