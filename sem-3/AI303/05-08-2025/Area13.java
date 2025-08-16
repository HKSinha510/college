import java.util.Scanner;

class Area13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose shape(enter number)\n1: Circle\n2: Rectangle\n3: Triangle");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Area of cicle = " + (3.14 * radius * radius));
                break;
                
            case 2:
                System.out.print("Enter Length: ");
                double l = sc.nextDouble();
                System.out.print("Enter Breadth: ");
                double b = sc.nextDouble();

                System.out.println("Area of Rectangle = " + (l * b));
                break;

            case 3:
                System.out.print("Enter Base: ");
                double ba = sc.nextDouble();
                System.out.print("Enter Heignt: ");
                double h = sc.nextDouble();

                System.out.println("Area of Triangle = " + (0.5 * ba * h));
                break;
                
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}