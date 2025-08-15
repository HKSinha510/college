import java.util.Scanner;

public class Sumnat6 {
    public static void main(String[] args) {
        // find sum of natural numbers using for loop
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number: ");
        Integer num = sc.nextInt();

        Integer sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of " + num + " natural numbers is " + sum);
    }
}
