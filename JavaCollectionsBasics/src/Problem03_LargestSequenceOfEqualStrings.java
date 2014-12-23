import java.util.Scanner;


public class Problem03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("String --> ");
		String inString = input.nextLine();
		String[] elements = inString.split(" ");
		String maxSequence = elements[0];
		int maxCounter = 1;
		int counter = 1;
		
		for (int i = 1; i < elements.length; i++) {
			
			if (elements[i].equals(elements[i-1])) {
				counter++;
			}else if (counter > maxCounter) {
				maxCounter = counter ;
				maxSequence = elements[i-1];
				counter = 1;
			}else {
				counter = 1;
			}
		}
		
		if (counter > maxCounter) {
			maxCounter = counter;
			maxSequence = elements[elements.length - 1];
		}
		
		for (int i = 0; i < maxCounter; i++) {
			System.out.print(maxSequence + " ");
		}
		
		System.out.println();
	}

}
