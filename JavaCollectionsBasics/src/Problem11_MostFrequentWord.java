import java.util.Arrays;
import java.util.Scanner;


public class Problem11_MostFrequentWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Text --> ");
		String text = input.nextLine().toLowerCase();
		String[] words = text.split("\\W+");
		Arrays.sort(words);
		int maxCount = 1;
		int counter = 1;
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i-1])) {
				counter++ ;
			} else {
				if (counter > maxCount) {
					maxCount = counter;
					counter = 1;
				} else {
					counter = 1;
				}
			}
		}
		
		if (counter > maxCount) {
			maxCount = counter ;
		}
		
		counter = 1 ;
		
		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i-1])) {
				counter ++;
				if (counter == maxCount) {
					System.out.printf("%s -> %d times", words[i], maxCount);
					System.out.println();
					counter = 1;
				}
			}
		}
		
	}
}
