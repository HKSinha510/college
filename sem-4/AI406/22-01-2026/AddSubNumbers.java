import java.util.Scanner;

class AddSubNumbers {

    int num1, num2, sum, diff;

    void readNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        num2 = sc.nextInt();
    }

    void add() {
        sum = num1 + num2;
    }

    void sub() {
        diff = num1 - num2;
    }

    void display() {
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
    }

    public static void main(String[] args) {
        AddSubNumbers obj = new AddSubNumbers();
        obj.readNumbers();
        obj.add();
        obj.sub();
        obj.display();
    }
}