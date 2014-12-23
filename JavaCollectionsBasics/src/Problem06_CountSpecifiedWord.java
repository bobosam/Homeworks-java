import java.util.Scanner;


public class Problem06_CountSpecifiedWord {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("text --> ");
		String text = input.nextLine();
		System.out.print("word --> ");
		String word = input.nextLine();
		String[] words = text.split("\\W+");
		int counter = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			if (word.equalsIgnoreCase(words[i])) {
				counter++ ;
			}
		}
		System.out.printf("Count of word --> %d", counter);
	}

}
