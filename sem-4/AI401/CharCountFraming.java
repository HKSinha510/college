
// ============================================================
// EXPERIMENT-7: Character Count Framing
// ============================================================
// File: CharCountFraming.java

import java.util.Scanner;

public class CharCountFraming {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter the frame size: ");
        int frameSize = sc.nextInt();

        int len = s.length();
        System.out.println("\nTotal characters: " + len);
        System.out.println("\n--- Frames ---");

        int frameNum = 1;
        for (int i = 0; i < len; i += frameSize) {
            int end = Math.min(i + frameSize, len);
            String frameData = s.substring(i, end);
            int count = frameData.length();

            System.out.println("Frame " + frameNum + ": | " + count + " | " + frameData + " |");
            frameNum++;
        }

        System.out.println("\nTotal frames: " + (frameNum - 1));
        sc.close();
    }
}