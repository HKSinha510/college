import java.util.Scanner;

class Volcon4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		String charac = sc.nextLine();
		
		switch (charac.toLowerCase()) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println(charac + " is a vowel");
				break;
				
			default:
				System.out.println(charac + " is a consonant");
		}
	}
}
