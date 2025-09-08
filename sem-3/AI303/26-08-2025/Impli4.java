import java.util.Scanner;

public class Impli4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int integer = sc.nextInt();

        double notint = integer;
        System.out.println("Implicitly converted to double: " + notint);

        sc.close();
    }
}
