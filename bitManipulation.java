import java.util.*;

class bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("enter the integer in which you want to perform bit manipulaton");
        int n = sc.nextInt();  //enter the number n(original number on which the operation is to be performed)  
        System.out.println("enter the position at which you want to perform bit manipulation ");
        int m = sc.nextInt();  //position at which get, set, clear or update operation is to be performed   
        int i = m-1; //the index of the position 
        int bitMask = 1<<i;
         // 1. get bit - to know where the value of bit is 0 or 1 
        System.out.println("1.get bit ");
        if((bitMask & n)== 0 ){
            System.out.println("the value is zero");
        }
        else{
            System.out.println("the value is 1");
        }

        //2. set bit - to set the value of the bit at given position to 1
        System.out.println("2.set bit");
        int newNumber = (bitMask | n);
        System.out.println(newNumber);

        //3. clear bit - to make the value of bit at the given posiiton zero
        System.out.println("3.clear bit");
        int notOperation = (~bitMask);
        int newNumber2 = (notOperation & n);
        System.out.println(newNumber2);

        //4. update bit - to change the value of bit as asked -> if said to make it 1 use set bit and if asked to make 0 use clear bit 

    }
    
}
