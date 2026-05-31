import java.util.Scanner;

class calculatorhw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers on which you want to perform the operation");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("please enter the operation which you want to perform\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder");
        String op = sc.nextLine();
        switch(op){
            case "Adiition" : System.out.println(a+b);
            break;
            case "Subtraction" : System.out.println(a-b);
            break;
            case "Multiplication" : System.out.println(a*b);
            break;
            case "Division" : System.out.println(a/b);
            break;
            case "Remainder" : System.out.println(a%b);
            break;
            default : System.out.println("please enter a valid operation ");
        }

      sc.close();  

    }
    
}
