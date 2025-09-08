import java.util.Scanner;

public class Whfibonacci9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter count for fibonacci: ");
        Integer count = sc.nextInt();

        int prev2 = 0, prev1 = 1;
        System.out.println("\n0: " + prev2);
        System.out.println("1: " + prev1);

        int counter = 2;
        while (counter < count) { 
            int c = prev1 + prev2;

            System.out.println(counter + ": " + c);

            prev2 = prev1;
            prev1 = c;

            counter++;
        }
    }
}
