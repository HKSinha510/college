// 4. Write a program to show Type Casting in JAVA

import java.util.Scanner;

public class TypeCastingDemo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a INT value: ");
        int intValue = sc.nextInt();
        double doubleValue = intValue;   // int → double

        System.out.println("Implicit Type Casting:");
        System.out.println("Int Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);

        // -----------------------------
        // Explicit Type Casting (Narrowing)
        
        System.out.print("\nEnter a DOUBLE value: ");
        double num = sc.nextDouble();
        int intNum = (int) num;   // double → int

        System.out.println("Explicit Type Casting:");
        System.out.println("Double Value: " + num);
        System.out.println("Int Value: " + intNum);
    }
}
