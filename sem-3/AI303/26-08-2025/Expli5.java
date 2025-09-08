import java.util.Scanner;

public class Expli5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter double: ");
        double input = sc.nextDouble();

        int converted = (int) input;
        System.out.println("Explicility converted to integer: " + converted);
    }
}
