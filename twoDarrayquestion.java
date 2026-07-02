import java.util.*;

class twoDarrayquestion {
    public static void main(String[] args) {
        /*
        Q] take a matrix as input from the user. search fora given number x and print the indices at which it occurs
        
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        //input
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //output
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
                if(x==matrix[i][j]){
                    System.out.println("x is found at indices "+i+" "+j);
                }
                
            }
        }

        */

        /*
        Q] For a given matrix of N x M, print its transpose.
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] trans = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                trans[i][j]=sc.nextInt();
            }
        }

        //transpose
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(trans[j][i]);
            }
            System.out.println();
        }

        */
        
        /* 
        Q]Print the spiral order matrix as output for a given matrix of numbers. 
        */
      
       Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        //input
        for(int i = 0; i<rows; i++){
            for(int j =0; j<cols; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int top = 0;
        int bottom = matrix.length -1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top<=bottom && left<=right){
            for(int i = left; i<=right; i++){
                System.out.print(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                System.out.print(matrix[i][right]);
            }
            right--;
            for(int i=right; i>=left; i--){
                System.out.print(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom; i>=top; i--){
                System.out.print(matrix[i][left]);
            }
            left++;
        }

        

      

        
        

    }
    
}
