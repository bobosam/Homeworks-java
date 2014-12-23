import java.util.Scanner;

public class Problem07_CountOfBitsOne {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("N --> ");
		int numberN = input.nextInt();
		int counter = 0;
		
		String binaryN = Integer.toBinaryString(numberN);
		
		for(int i = 0 ; i < binaryN.length() ; i++){
			if(binaryN.charAt(i) == '1'){
				counter++;
			}
		}
		
		System.out.printf("Count --> %d%n", counter);
	}	
}


