import java.util.Locale;
import java.util.Scanner;

public class Problem06_FormattingNumbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("First number --> ");
		int firstNumber = input.nextInt();
		System.out.print("Second number --> ");
		double secondNumber = input.nextDouble();
		System.out.print("Third number --> ");
		double thirdNumber = input.nextDouble();
		
		String firstNumberBin = Integer.toBinaryString(firstNumber);
		String bin = String.format("%10s", firstNumberBin).replace(" ", "0");
		String firstNumberHex = Integer.toHexString(firstNumber).toUpperCase();
		String hex = String.format("%-10s", firstNumberHex);
		
		System.out.printf("|%s|%s|%10.2f|%-10.3f|%n",hex, bin, secondNumber, thirdNumber);
	}
}
