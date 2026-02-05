import java.util.Scanner;

public class revarr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[6];

        System.out.println("Ente 6 characters:");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.next().charAt(0);

        }
        System.out.println("Character array in reverse order:");
        for(int i = arr.length -1; i >= 0; i--){
            System.out.println(arr[i] + " ");
        }
    }
}