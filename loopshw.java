 import java.util.*;
 class loopshw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //printing all even numbers till n
        /*int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
           
        }*/


        /*for( ; ; ){
            System.out.println("apna college");
        }*/

        System.out.println("enter either 1 or 0");
        int n = sc.nextInt();
        switch(n){
            case 1 : System.out.println("enter the marks of the student out of 100");
            int m = sc.nextInt();
            if(m>=90){
                System.out.println("this is good");
            }
            else if(m >= 60 && m<=89){
                System.out.println("this is also good");
            }
            else{
                System.out.println("this is good as well");
            }
            break;
            case 0 : System.out.println("stop here");
            break;
            default : System.out.println("enter a valid number");
        }

        
    }
    
}
