import java.util.Scanner;


public class Problem07_CountSubstringOccurrences {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Text --> ");
		String text = input.nextLine().toLowerCase();
		System.out.print("Search string --> ");
		String searchString = input.nextLine().toLowerCase();
		int index = text.indexOf(searchString);
		int counter = 0;
		
		while (index != -1) {
			counter ++;
			index = text.indexOf(searchString, index + 1);
		}
		
		System.out.printf("String appears --> %d%n", counter);
	}

}
