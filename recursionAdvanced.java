import java.util.*;

class recursionAdvanced {

    //1.
    public static void printPerm(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }

    }

    //2.
    public static int countPaths(int k, int j, int n, int m){
        if(k==n || j==m ){
            return 0;
        }
        if(k==n-1 && j==m-1){
            return 1;
        }
        int downpath = countPaths(k+1, j, n, m);
        int rightpath = countPaths(k, j+1, n, m);
        return downpath + rightpath ;
    }

    //3.
    public static int placeTiles(int x, int y){
        if(x==y){
            return 2;
        }
        if(x<y){
            return 1;
        }
        //vertical
        int verticalPlacement = placeTiles(x-y, y);
        //horizontal
        int hozplacement = placeTiles(x-1, y);
        return verticalPlacement + hozplacement;
    }

    //4.
    public static int inviteWays(int w){
        if(w<=1){
            return 1;
        }

        //single
        int single = inviteWays(w-1);

        //pairs
        int pairs = (w-1)*inviteWays(w-2);

        return single + pairs;
    }

    //5.
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int z=0; z<subset.size(); z++){
            System.out.print(subset.get(z)+" ");
        }  
        System.out.println();
    }
    public static void allSubset(int q, ArrayList<Integer> subset){
        if(q==0){
            printSubsets(subset);
            return;
        }
        //to add
        subset.add(q);
        allSubset(q-1, subset);

        //to not add
        subset.remove(subset.size()-1);
        allSubset(q-1, subset);
    }
    public static void main(String[] args) {
        
        //1. print all the permutations of a string
        String str = "abc";
        printPerm(str, "");

        //2. count total paths in a maze to move from (0,0) to (n,m)
        int n = 3;
        int m = 3;
        int totalPaths = countPaths(0, 0 , n, m);
        System.out.println(totalPaths);

        //3.place tiles of size 1xq in a floor of size pxq
        int x = 4;
        int y = 2;
        System.out.println(placeTiles(x, y));

        //4.find the number of ways in which you can invite w people to your party, single and in pairs
        int w =4;
        System.out.println(inviteWays(w));

        //5.Print all the subsets of a set of first q natural numbers
        int q = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        allSubset(q, subset);

        

    } 
}
