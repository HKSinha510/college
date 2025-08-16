import java.util.*;

public class Bin2hex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> lookup = Map.ofEntries(
            Map.entry("0000", "0"),
            Map.entry("0001", "1"),
            Map.entry("0010", "2"),
            Map.entry("0011", "3"),
            Map.entry("0100", "4"),
            Map.entry("0101", "5"),
            Map.entry("0110", "6"),
            Map.entry("0111", "7"),
            Map.entry("1000", "8"),
            Map.entry("1001", "9"),
            Map.entry("1010", "A"),
            Map.entry("1011", "B"),
            Map.entry("1100", "C"),
            Map.entry("1101", "D"),
            Map.entry("1110", "E"),
            Map.entry("1111", "F")
        );

        System.out.print("Enter a binary number: ");
        String bin = sc.nextLine();

        int binLen = bin.length();

        if (binLen % 4 != 0) {
            String b = "0";
            bin = b.repeat(4 - (binLen % 4)) + bin;
        }

        String hex = "";
        int iB = 0;
        for (int i = 4; i <= bin.length(); i+=4) {
            String sub = bin.substring(iB, i);
            iB = i;
            hex += lookup.get(sub);
        }

        System.out.println(hex);
    }
}
