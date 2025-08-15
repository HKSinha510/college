import java.util.Scanner;

public class Recsum11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int recsum = addDigit(number);
        System.out.println("Recursive sum of " + number + " is " + recsum);
    }

    public static int addDigit(int num) {
        if ((num % 10) == num) {
            return num;

        } else {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // Add last digit
                num /= 10;        // Remove last digit
            }

            return addDigit(sum);
        }
    }
}
