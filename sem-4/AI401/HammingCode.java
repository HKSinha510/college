import java.util.Scanner;

public class HammingCode {

    static int[] frame;
    static int totalLength;

    // Calculate and insert parity bits into the frame
    static void calculateParityBits() {
        for (int i = 1; i <= totalLength; i++) {
            if (isPowerOfTwo(i)) {
                frame[i] = 0; // placeholder
                int parity = 0;
                for (int j = 1; j <= totalLength; j++) {
                    if (j != i && (j & i) != 0) {
                        parity ^= frame[j];
                    }
                }
                frame[i] = parity;
            }
        }
    }

    // Check and find error position
    static int findErrorPosition() {
        int errorPos = 0;
        for (int i = 1; i <= totalLength; i++) {
            if (isPowerOfTwo(i)) {
                int parity = 0;
                for (int j = 1; j <= totalLength; j++) {
                    if ((j & i) != 0) {
                        parity ^= frame[j];
                    }
                }
                if (parity != 0) errorPos += i;
            }
        }
        return errorPos;
    }

    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    static void printFrame() {
        System.out.print("[ ");
        for (int i = 1; i <= totalLength; i++) {
            System.out.print(frame[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of data bits: ");
        int m = sc.nextInt();

        int[] data = new int[m];
        System.out.println("Enter " + m + " data bits (one by one):");
        for (int i = 0; i < m; i++) data[i] = sc.nextInt();

        // Calculate number of parity bits needed: 2^r >= m + r + 1
        int r = 0;
        while (Math.pow(2, r) < (m + r + 1)) r++;

        totalLength = m + r;
        frame = new int[totalLength + 1]; // 1-indexed

        // Place data bits in non-power-of-2 positions
        int dataIdx = 0;
        for (int i = 1; i <= totalLength; i++) {
            if (!isPowerOfTwo(i)) {
                frame[i] = data[dataIdx++];
            }
        }

        System.out.println("\nNumber of parity bits required: " + r);
        System.out.print("Frame before parity (0 = parity placeholder): ");
        printFrame();

        calculateParityBits();

        System.out.print("Hamming Code (transmitted frame)           : ");
        printFrame();

        // Introduce error
        System.out.print("\nEnter bit position where error occurred (1 to " + totalLength + "): ");
        int errPos = sc.nextInt();

        frame[errPos] ^= 1; // flip the bit
        System.out.print("Frame after error at position " + errPos + "               : ");
        printFrame();

        // Detect and correct error
        int detectedPos = findErrorPosition();
        if (detectedPos == 0) {
            System.out.println("No error detected.");
        } else {
            System.out.println("Error detected at bit position: " + detectedPos);
            frame[detectedPos] ^= 1; // correct the bit
            System.out.print("Corrected frame                                : ");
            printFrame();
        }

        sc.close();
    }
}