import java.util.Scanner;

public class Whfac10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        Integer num = sc.nextInt();
        
        Integer fac = 1;

        int counter = 1;
        while (counter <= num) {
            fac *= counter;
            counter++;
        }
        
        System.out.println("Factorial of " + num + " is " + fac);
    }
}
