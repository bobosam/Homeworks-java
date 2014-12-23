import java.util.Scanner;


public class Problem05_CountAllWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("String -->");
		String sentence = input.nextLine();
		String[] words = sentence.split("\\W+");
		int count = words.length;
		System.out.printf("Count of words --> %d", count);
	}

}
