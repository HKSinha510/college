import java.util.*;

public class Hammingcode4 {

    // Function to calculate number of parity bits
    static int calculateParityBits(int m) {
        int r = 0;
        while (Math.pow(2, r) < (m + r + 1)) {
            r++;
        }
        return r;
    }

    // Function to generate Hamming Code
    static void generateHammingCode(String data) {
        int m = data.length();
        int r = calculateParityBits(m);
        int totalLength = m + r;

        int[] hamming = new int[totalLength + 1]; // 1-based indexing

        // Step 1: Place data bits
        int j = 0;
        for (int i = 1; i <= totalLength; i++) {
            if ((i & (i - 1)) == 0) {
                // power of 2 → parity bit
                hamming[i] = 0;
            } else {
                hamming[i] = data.charAt(m - j - 1) - '0';
                j++;
            }
        }

        // Step 2: Calculate parity bits
        for (int i = 0; i < r; i++) {
            int parityPos = (int) Math.pow(2, i);
            int parity = 0;

            for (int k = 1; k <= totalLength; k++) {
                if ((k & parityPos) != 0) {
                    parity ^= hamming[k];
                }
            }
            hamming[parityPos] = parity;
        }

        // Step 3: Print result
        System.out.print("Hamming Code: ");
        for (int i = totalLength; i >= 1; i--) {
            System.out.print(hamming[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary data: ");
        String data = sc.next();
        
        generateHammingCode(data);
    }
}