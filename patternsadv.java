 class patternsadv {
    public static void main(String[] args) {
        /*
        Q1] Print butterfly pattern
        
       for(int i=1; i<=4; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(4-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i=4; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=2*(4-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
        */

       /*
       Q2] print pyramid of numbers
                 1
                2 2
               3 3 3
              4 4 4 4 
             5 5 5 5 5
       
      for(int i=1; i<=5;i++){
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
      }
        */

      /*
      Q3] print the palindrome pattern
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
      
     for(int i=1; i<=5; i++){
        for(int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        for(int j=i; j>=1; j--){
            System.out.print(j);
        }
        for(int j=2; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
     }
    */

     /*
     Q4] Print diamond pattern
                  *
                * * *
              * * * * *
            * * * * * * *
            * * * * * * *
              * * * * *
                * * *
                  * 
     */
    for(int i=1; i<=4; i++){
        for(int j=1; j<=4-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i+(i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=4; i>=1; i--){
        for(int j=1; j<=4-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i+(i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    
}
