// 6. Write a program to show inheritance

import java.util.Scanner;

// Parent Class: Takes input from user
class InputNumbers {
    int a, b;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
}

// Child Class: Performs addition

public class SingleInheritance extends InputNumbers{
    void add() {
        int sum = a + b;
        System.out.print("Sum = " + sum);
    }

    public static void main(String[] args) {
        SingleInheritance obj = new SingleInheritance();

        obj.getInput();     // Parent Class
        obj.add();          // Child class method
    }
}
