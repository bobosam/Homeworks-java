import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class Problem04_TheSmallestOf3Numbers {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("First number --> ");
		double firstNumber = input.nextDouble();
		System.out.print("Second number --> ");
		double secondNumber = input.nextDouble();
		System.out.print("Third number --> ");
		double thirdNumber = input.nextDouble();
		
		double smallest = findSmallestNumber(firstNumber, secondNumber, thirdNumber);
		
		DecimalFormat formatter= new DecimalFormat("0.###");
		System.out.println(formatter.format(smallest));
	}

	public static double findSmallestNumber(double firstNumber,
											double secondNumber, double thirdNumber) {
		double smallest = firstNumber ;
		
		if( smallest > secondNumber) {
			smallest = secondNumber ;
		}
		if ( smallest > thirdNumber) {
			smallest = thirdNumber ;
		}
		return smallest ;
	}

}
