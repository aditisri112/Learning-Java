
class recursionBasic {   
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        //1.print numbers from 5 to 1
        int n = 5;
        printNum(n); //n=5

        //
    } 
}
