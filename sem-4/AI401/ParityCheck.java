import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the data bits (e.g. 1010110): ");
        String data = sc.next();

        int countOnes = 0;
        for (char c : data.toCharArray()) {
            if (c == '1') countOnes++;
        }

        // Even parity: parity bit makes total 1s even
        int parityBit = (countOnes % 2 == 0) ? 0 : 1;
        String transmitted = data + parityBit;

        System.out.println("\n--- Sender Side ---");
        System.out.println("Original Data     : " + data);
        System.out.println("Number of 1s      : " + countOnes);
        System.out.println("Parity Bit (Even) : " + parityBit);
        System.out.println("Transmitted Data  : " + transmitted);

        // --- Receiver Side ---
        System.out.println("\n--- Receiver Side ---");
        System.out.print("Enter received data (with parity bit): ");
        String received = sc.next();

        int receivedOnes = 0;
        for (char c : received.toCharArray()) {
            if (c == '1') receivedOnes++;
        }

        System.out.println("Number of 1s in received data: " + receivedOnes);
        if (receivedOnes % 2 == 0) {
            System.out.println("Result: No error detected.");
        } else {
            System.out.println("Result: Error detected!");
        }

        sc.close();
    }
}