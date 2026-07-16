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

    //2.
    public static void reverseString(String rev, int i){
        if(i<0){
            return;
        }
        char ch = rev.charAt(i);
        System.out.print(ch);
        reverseString(rev, i-1);
    }

    //3.
    public static int first = -1;   //first and last are made as static variable as we don't want to create new stack blocks consisting of new values of these variables during recursion, we want their values to be consatant 
    public static int last = -1;
    public static void findOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findOccurance(str, idx +1, element);

    }

    //4.
    public static void checkArray(int arr[], int index){
        if(index == arr.length -1){
            System.out.println("is strictly increasing");
            return;
        }
        if(arr[index]>=arr[index+1]){
            System.out.println("not strictly increasing");
        }
        else{
            checkArray(arr, index+1);
        }
    }

    //5.
    public static void moveAllX(String strOriginal, int id, int count_x, String newString){
        if(id == strOriginal.length()){
            for(int f = 0; f<count_x; f++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char current = strOriginal.charAt(id);
        if(current == 'x'){
            count_x++;
            moveAllX(strOriginal, id +1, count_x, newString);
        }
        else{
            newString = newString + current;
            moveAllX(strOriginal, id +1, count_x, newString);
        }
    }

    //6.
    public static boolean map[] = new boolean[26];
    public static void removeDuplicate(String originalString, int indexMoving, String newString){
        if(indexMoving==originalString.length()){
            System.out.println(newString);
            return;
        }
        char currentCharacter = originalString.charAt(indexMoving);
        if(map[currentCharacter-'a']==true){
            removeDuplicate(originalString, indexMoving+1, newString);
        }
        else{
            newString+=currentCharacter;
            map[currentCharacter-'a']=true;
            removeDuplicate(originalString, indexMoving+1, newString);
        }
    }

    //7.
    public static void printAllSequences(String sequence, int traverse, String newStringWithSubsequences){
        if(traverse == sequence.length()){
            System.out.println(newStringWithSubsequences);
            return;
        }
        char curren = sequence.charAt(traverse);

        //to include
        printAllSequences(sequence, traverse+1, newStringWithSubsequences+curren);

        //not included
        printAllSequences(sequence, traverse+1, newStringWithSubsequences);
    }
    
    //8.
    public static void uniqueSubsequences(String unique, int move, String newUnique, HashSet<String> set ){
        if(move == unique.length()){
            if(set.contains(newUnique)){
                return;
            }
            else{
                System.out.println(newUnique);
                set.add(newUnique);
                return;
            }
        }
        char newChar = unique.charAt(move);
        //to include
        uniqueSubsequences(unique, move+1, newUnique+newChar , set);

        //to not include
        uniqueSubsequences(unique, move+1, newUnique, set);
    }

    //9.
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void comb(String keypadInput, int pointout, String combination){
        if(pointout==keypadInput.length()){
            System.out.println(combination);
            return;
        }
        char currentt = keypadInput.charAt(pointout);
        String mapping = keypad[currentt-'0'];
        for(int g=0; g < mapping.length(); g++){
            comb(keypadInput, pointout+1, combination+mapping.charAt(g));
        }
    }   
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.tower of hanoi -> time complexity is O(2^n)
        System.out.println("enter the number of blocks in tower of hanoi");
        int n = sc.nextInt();
        towerOfHanoi(n, "s", "h", "d");

        System.out.println("\n");

        //2.Print string in reverse
        String rev = "abcd";
        int i = rev.length() -1;
        reverseString(rev,i );

        System.out.println("\n");

        //3.Find first & last occurrence of element in string
        String str = "abaacdaefaah";
        int idx = 0;
        char element = 'a';
        findOccurance(str, idx, element);

        System.out.println("\n");

        //4.Check if the array is sorted (strictly increasing)
        System.out.println("enetr 4 elements of an array");
        int arr[] = new int[4];
        for(int j = 0; j<4; j++){
            arr[j] = sc.nextInt();
        }
        int index = 0;
        checkArray(arr, index);

        //5.Move all 'x' to the end -> time coplexity is O(n+count)=O(n+n)=O(2n) but constant is ignored hence it is O(n)        
        String strOriginal = "axbcxxd";
        moveAllX(strOriginal, 0, 0, "");

        //6.Remove all duplicates in String
        String originalString = "abbcddeffgg";
        removeDuplicate(originalString, 0, "");

        //7.Print all subsequences
        String sequemce = "abc";
        printAllSequences(sequemce, 0, "");

        //8. Print all unique subsequences -> use hashset data structure -> hashset is a set which stores only unique values of elements 
        String unique = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(unique, 0, "", set);

        //9.Print Keypad Combinations
        String keypadInput = "23";
        comb(keypadInput, 0, "");
         
    }
    
}
