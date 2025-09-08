import java.util.Scanner;

class Circle {
    Circle(double r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
}

public class Paramcon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        Circle c = new Circle(sc.nextDouble());

        sc.close();
    }
}
