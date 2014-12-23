import java.util.Scanner;


public class Problem04_LongestIncreasingSequence {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sequence 1 2 3 ... --> ");
		String inSequence = input.nextLine();
		String[] numbers = inSequence.split(" ");
		int position = 0;
		int maxCount = 1;
		int counter = 1;
		System.out.print(numbers[0] + " ");
		
		for (int i = 1; i < numbers.length; i++) {
			 
			if (Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i-1])) {
				counter ++;
				System.out.print(numbers[i] + " ");
			} else {
				if (counter > maxCount) {
					maxCount = counter ;
					position = i - counter;
					counter = 1;
					System.out.println();
					System.out.print(numbers[i] + " ");
				} else {
					counter = 1;
					System.out.println();
					System.out.print(numbers[i] + " ");
				}
				
			}
		}
		if (counter > maxCount) {
			position = numbers.length - counter ;
			maxCount = counter;
		}
		System.out.println();
		System.out.print("Longest :");
		
		for (int i = position; i < position + maxCount; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

}
