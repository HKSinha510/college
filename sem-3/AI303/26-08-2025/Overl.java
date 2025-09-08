import java.util.Random;

class Rectangle {
    int length;
    int breadth;

    Rectangle() {
        this.length = 1;
        this.breadth = 2;

        System.out.println(this.length * this.breadth);
    }

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;

        System.out.println(this.length * this.breadth);
    }
}

public class Overl {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(4, 2);
    }
}
