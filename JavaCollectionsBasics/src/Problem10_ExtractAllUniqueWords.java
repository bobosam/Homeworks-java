import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class Problem10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Text --> ");
		String text = input.nextLine().toLowerCase();
		String[] words = text.split("\\W+");
		SortedSet<String> uniqueWords = new TreeSet<>();
		
		for (String word : words) {
			uniqueWords.add(word);
		}
		
		System.out.print("Output --> ");
		
		for (String string : uniqueWords) {
			System.out.printf("%s ", string);
		}
	}

}
