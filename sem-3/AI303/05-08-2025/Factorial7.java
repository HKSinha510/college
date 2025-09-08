import java.util.Scanner;

public class Factorial7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        Integer num = sc.nextInt();
        
        Integer fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }
        
        System.out.println("Factorial of " + num + " is " + fac);
    }
}
