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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.tower of hanoi
        System.out.println("enter the number of blocks in tower of hanoi");
        int n = sc.nextInt();
        towerOfHanoi(n, "s", "h", "d");
         
    }
    
}
