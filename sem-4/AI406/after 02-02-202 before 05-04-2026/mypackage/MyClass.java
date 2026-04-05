// Declare the package
package mypackage;

// Define a class inside the package
public class MyClass {

    // Method to display a message
    public void showMessage() {
        System.out.println("Hello from MyClass inside mypackage!");
    }

    // Main method to run the program
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage();
    }
}