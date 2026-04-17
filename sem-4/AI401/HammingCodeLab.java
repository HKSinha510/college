import java.util.*;

public class HammingCodeLab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter frame size: ");
        int m = sc.nextInt();

        int[] db = new int[m];

        System.out.println("Enter frame (bits): ");
        for (int i = 0; i < m; i++) {
            db[i] = sc.nextInt();
        }

        System.out.print("Enter redundancy bits: ");
        int r = sc.nextInt();

        int total = m + r;
        int[] df = new int[total + 1]; // 1-based indexing

        // Step 1: Insert data + parity placeholders
        int j = 0;
        for (int i = 1; i <= total; i++) {
            if ((i & (i - 1)) == 0) {
                df[i] = -1; // parity bit
            } else {
                df[i] = db[j++];
            }
        }

        // Step 2: Calculate parity bits (even parity)
        for (int i = 0; i < r; i++) {
            int pos = (int) Math.pow(2, i);
            int count = 0;

            for (int k = 1; k <= total; k++) {
                if ((k & pos) != 0 && df[k] == 1) {
                    count++;
                }
            }

            df[pos] = (count % 2 == 0) ? 0 : 1;
        }

        // Print Hamming Code
        System.out.print("Hamming Code: ");
        for (int i = total; i >= 1; i--) {
            System.out.print(df[i] + " ");
        }

        // Step 3: Introduce error
        System.out.print("\nEnter bit position for error: ");
        int eb = sc.nextInt();

        df[eb] = (df[eb] == 1) ? 0 : 1;

        System.out.print("Frame after error: ");
        for (int i = total; i >= 1; i--) {
            System.out.print(df[i] + " ");
        }

        // Step 4: Detect error
        int errorPos = 0;

        for (int i = 0; i < r; i++) {
            int pos = (int) Math.pow(2, i);
            int count = 0;

            for (int k = 1; k <= total; k++) {
                if ((k & pos) != 0 && df[k] == 1) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                errorPos += pos;
            }
        }

        System.out.println("\nError detected at position: " + errorPos);
    }
}