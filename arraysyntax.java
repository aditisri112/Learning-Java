import java.util.*;

class arraysyntax {
    public static void main(String[] args) {
        // syntax usually used if we dont know the size and input values of array 

       /* int marks[] = new int[3];
        marks[0]= 90; //maths
        marks[1]= 99; //eng
        marks[2]= 94; //sci
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
            */

        // OR - syntax if we already know the size and values in array

        /*int marks[]={90, 99, 94};
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }
            */

        //taking input of size as well as iteam values of a array
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int marks[] = new int[size];

         for(int i=0; i<size;i++){
            marks[i]=sc.nextInt();
         }

         for(int j=0; j<size; j++){
            System.out.println(marks[j]);
         }




    }
    
}
