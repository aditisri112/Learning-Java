 class patterns {
    public static void main(String[] args) {
        /* 
        Q1] print the pattern of solid rectabgle like
                   *****
                   *****
                   *****
                   *****   
                   
                for(int i=1; i<=4; i++){
                    for(int j=1; j<=5; j++){
                      System.out.print("*");
                   }
                   System.out.println();  //because we only need new line and nothing else
                }   
        */


        /*
        Q2] Print the pattern of hollow rectangle like
                   *****
                   *   *
                   *   *
                   *****
        
       for(int i=1; i<=4; i++){
           for(int j=1;j<=5; j++ ){
            if(i==1 || j==1 || i==4 || j==5){
                System.out.print("*");
            }
            else{
                System.out.print(" ");

            }
        
           }
           System.out.println();
       } 
        */

       /*
       Q3] Print the pattern of galf pyramid 
            *
            **
            ***
            ****
       

            for(int i=1; i<=4; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        */


        /*
        Q4] print the pattern of inverted half pyramid
             ****
             ***
             **
             *
        
       for(int i=1; i<=4; i++){
         for(int j=4; j>=i; j--){
            System.out.print("*");
        }
        System.out.println();
       }
        */

       /*
       Q5]print the pattern of inverted and rotated half pyramid
                 *
               * *
            *  * *
          * *  * *
      

       for(int i=1; i<=4; i++){
        for(int j=1; j<=4-i; j++){
            System.out.print(" ");
        }
        
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
        */

    /*
    Q6] print the pattern of half pyramid with numbers
        1
        1 2
        1 2 3
        1 2 3 4 
        1 2 3 4 5
    
   for(int i=1; i<=5; i++){
    for(int j=1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
   }
    */

   /*
   Q7]print the pattern of Inverted Half Pyramid with Numbers
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
   
    for(int i=4; i>=1; i--){
         for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
       }
    */

    /*
    Q8] print floyd's triangle
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15
    
   int number = 1;
   for(int i=1; i<=5; i++){
    for(int j=1; j<=i; j++){
        System.out.print(number+" ");
        number ++;
    }
    System.out.println();
   }
    */

   /*
   Q9]
   */
}
 }

