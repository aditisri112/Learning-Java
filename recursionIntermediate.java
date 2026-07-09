import java.util.*;

class recursionIntermediate {
    //1.
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer "+n+" from "+src+" 3to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    //2.
    public static void reverseString(String rev, int i){
        if(i<0){
            return;
        }
        char ch = rev.charAt(i);
        System.out.print(ch);
        reverseString(rev, i-1);
    }

    //3.
    public static int first = -1;   //first and last are made as static variable as we don't want to create new stack blocks consisting of new values of these variables during recursion, we want their values to be consatant 
    public static int last = -1;
    public static void findOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurance(str, idx +1, element);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.tower of hanoi -> time complexity is O(2^n)
        System.out.println("enter the number of blocks in tower of hanoi");
        int n = sc.nextInt();
        towerOfHanoi(n, "s", "h", "d");

        System.out.println("\n");

        //2.Print string in reverse
        String rev = "abcd";
        int i = rev.length() -1;
        reverseString(rev,i );

        System.out.println("\n");

        //3.Find first & last occurrence of element in string
        String str = "abaacdaefaah";
        int idx = 0;
        char element = 'a';
        findOccurance(str, idx, element);


        
         
    }
    
}
