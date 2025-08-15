import java.util.Scanner;

class Calc5 {
    public static void main(String[] args) {
        // Java Program to make a Simple Calculator(+,-,*,%,/) using Switch Case

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose operator(+, -, *, %, /): ");
        String operator = sc.nextLine();

        System.out.println("\nEnter num1: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2: ");
        double num2 = sc.nextDouble();

        switch (operator) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;

            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;

            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                break;

            case "%":
                System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
                break;

            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
        
            default:
                System.out.println("Invalid Operator");
        }

    }    
}
