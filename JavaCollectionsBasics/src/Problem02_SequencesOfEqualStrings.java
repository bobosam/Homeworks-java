import java.util.Arrays;
import java.util.Scanner;


public class Problem02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("String --> ");
		String inString = input.nextLine();
		String[] elements = inString.split(" ");
				
		for (int i = 0; i < elements.length - 1; i++) {
			System.out.print(elements[i]+ " ");
			
			if (!(elements[i].equals(elements[i + 1]))) {
				System.out.println();
			}
		}
		System.out.println(elements[elements.length - 1]);
	}

}
