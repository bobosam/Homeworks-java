import java.util.Scanner;


public class Problem08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("N --> ");
		int numberN = input.nextInt();
		String stringN = Integer.toBinaryString(numberN);
		int counter = 0 ;
		
		for(int i = 0 ; i < (stringN.length()-1) ; i++) {
			if(stringN.charAt(i) == stringN.charAt(i+1)) {
				counter++ ;
			}
		}
		System.out.printf("Count --> %d", counter);
	}
}
