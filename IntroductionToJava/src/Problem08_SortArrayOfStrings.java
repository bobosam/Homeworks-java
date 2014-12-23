import java.util.Scanner;
import java.util.Arrays;

public class Problem08_SortArrayOfStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("n=");
		int n = input.nextInt();
		input.nextLine();
		
		String[] innArray = new String[n];
		
		for (int i = 0; i<n ; i++){
			innArray[i] = input.nextLine();
		}
		
		Arrays.sort(innArray);
		
		for (String word : innArray) {
			System.out.printf("%s%n", word);
		}
		
	}

}
