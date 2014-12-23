import java.util.Scanner;

public class Problem05_DecimalToHexadecimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("decimal -->");
		int decimalNumber = input.nextInt();
		String hex = Integer.toHexString(decimalNumber);
		
		System.out.println("Hex --> " + hex.toUpperCase());
	}
}
