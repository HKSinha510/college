
// ============================================================
// EXPERIMENT-6: Bit Stuffing
// ============================================================
// File: BitStuffing.java

import java.util.Scanner;

public class BitStuffing {
    static String stuffBits(String data) {
        StringBuilder stuffed = new StringBuilder();
        int consecutiveOnes = 0;

        for (char bit : data.toCharArray()) {
            stuffed.append(bit);
            if (bit == '1') {
                consecutiveOnes++;
                if (consecutiveOnes == 5) {
                    stuffed.append('0'); // stuff a 0
                    consecutiveOnes = 0;
                }
            } else {
                consecutiveOnes = 0;
            }
        }
        return stuffed.toString();
    }

    static String destuffBits(String data) {
        StringBuilder destuffed = new StringBuilder();
        int consecutiveOnes = 0;
        int i = 0;

        while (i < data.length()) {
            char bit = data.charAt(i);
            destuffed.append(bit);
            if (bit == '1') {
                consecutiveOnes++;
                if (consecutiveOnes == 5) {
                    i++; // skip the stuffed 0
                    consecutiveOnes = 0;
                }
            } else {
                consecutiveOnes = 0;
            }
            i++;
        }
        return destuffed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String FLAG = "01111110"; 

        System.out.print("Enter binary data: ");
        String data = sc.next();


        String stuffed = stuffBits(data);
        String transmitted = FLAG + stuffed + FLAG;

        System.out.println("\n--- Sender Side ---");
        System.out.println("Original Data    : " + data);
        System.out.println("After Bit Stuffing: " + stuffed);
        System.out.println("Transmitted Frame: " + transmitted);

        System.out.println("\n--- Receiver Side ---");
        
        String stripped = transmitted.substring(FLAG.length(), transmitted.length() - FLAG.length());
        System.out.println("After Removing Flags : " + stripped);
        String destuffed = destuffBits(stripped);
        System.out.println("After Bit Destuffing : " + destuffed);

        if (destuffed.equals(data)) {
            System.out.println("Data received correctly!");
        } else {
            System.out.println("Data mismatch - error!");
        }

        sc.close();
    }
}