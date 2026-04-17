// ============================================================
// EXPERIMENT-5: CRC (Cyclic Redundancy Check)
// ============================================================
// File: CRC.java

import java.util.Scanner;

public class CRC {

    // XOR two binary strings of equal length
    static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            result.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return result.toString();
    }

    // Perform modulo-2 binary division, return remainder
    static String mod2Divide(String dividend, String divisor) {
        int divisorLen = divisor.length();
        String remainder = dividend.substring(0, divisorLen);

        while (divisorLen < dividend.length()) {
            if (remainder.charAt(0) == '1') {
                remainder = xor(divisor, remainder).substring(1) + dividend.charAt(divisorLen);
            } else {
                remainder = xor(new String(new char[divisorLen]).replace('\0', '0'), remainder).substring(1) + dividend.charAt(divisorLen);
            }
            divisorLen++;
        }

        if (remainder.charAt(0) == '1') {
            remainder = xor(divisor, remainder);
        } else {
            remainder = xor(new String(new char[divisorLen]).replace('\0', '0'), remainder);
        }

        return remainder;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the data bits: ");
        String data = sc.next();
        System.out.print("Enter generator polynomial (divisor): ");
        String generator = sc.next();

        int appendZeros = generator.length() - 1;

        // Append zeros to data
        String augmented = data + "0".repeat(appendZeros);
        System.out.println("\nAugmented data (data + " + appendZeros + " zeros): " + augmented);

        // Calculate CRC (remainder)
        String crc = mod2Divide(augmented, generator);
        System.out.println("CRC / Checksum                            : " + crc);

        // Form transmitted codeword
        String codeword = data + crc;
        System.out.println("Transmitted Codeword (data + CRC)         : " + codeword);

        // Error detection
        System.out.print("\nTest error detection? 0 = Yes, 1 = No : ");
        int choice = sc.nextInt();

        String receivedData = codeword;
        if (choice == 0) {
            System.out.print("Enter bit position to introduce error (0-indexed): ");
            int pos = sc.nextInt();
            char[] arr = receivedData.toCharArray();
            arr[pos] = (arr[pos] == '0') ? '1' : '0';
            receivedData = new String(arr);
            System.out.println("Erroneous received data: " + receivedData);
        }

        // Verify at receiver
        String checkRemainder = mod2Divide(receivedData, generator);
        System.out.println("Remainder at receiver  : " + checkRemainder);

        boolean hasError = false;
        for (char c : checkRemainder.toCharArray()) {
            if (c == '1') { hasError = true; break; }
        }

        if (hasError) {
            System.out.println("Result: Error detected!");
        } else {
            System.out.println("Result: No error detected.");
        }

        sc.close();
    }
}