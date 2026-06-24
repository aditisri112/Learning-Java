import java.util.*;

class arrayquestions {
    public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);

    /*
    Q] take an array as input from the user. Search for a given number x and print the index at which it occurs
    
    int size = sc.nextInt();
    int numbers [] = new int[size];
    for(int i = 0; i<size; i++){
        numbers[i] = sc.nextInt();
    }

    int x = sc.nextInt();

    for(int j=0; j<size; j++){      //can use numbers.length instead of size
        if(numbers[j]==x){
            System.out.println("x found at index "+ j);
        }
    }
    */

    /*
    Q] Take an array of names as input from the user and print them on the screen.
    
    int size = sc.nextInt();
    String names[]= new String[size];
    for(int i = 0; i<size; i++){
        names[i]=sc.next();
    }

    for(int i=0; i<size; i++){
        System.out.println(names[i]);
    }
    
    */

    /*
    Q]Find the maximum & minimum number in an array of integers. 

    int size = sc.nextInt();
    int maxmin[]= new int [size];
    for(int i = 0 ; i<size; i++){
        maxmin[i]= sc.nextInt();
    }
    int min = maxmin[0];
    int max = maxmin[0];

    for(int i =1; i<size; i++){
        if(maxmin[i]<min){
            min = maxmin[i];
        }

        if(maxmin[i]>max){
            max = maxmin[i];
        }
    }

    System.out.println("the min number is " + min);
    System.out.println("the maximum number is "+ max);

    */

    /*
    Q]Take an array of numbers as input and check if it is an array sorted in ascending order.
    */

    int size = sc.nextInt();
    int arr[]= new int[size];
    int i;
    for( i = 0; i<size; i++){
        arr[i]= sc.nextInt();
    }
    for( i = 0; i<size-1; i++ ){  //keep in mind the size-1
        if(arr[i]>arr[i+1]){
            System.out.println("not ascending");
            break;
        }
    }

    if( i==size-1){
        System.out.println("in ascending order");
    }

   }
}
