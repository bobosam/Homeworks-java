import java.util.ArrayList;
import java.util.Scanner;


public class Problem09_CombineListsOfLetters {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("First letter --> ");
		String firstLetter = input.nextLine();
		System.out.print("Second letter --> ");
		String secondLetter = input.nextLine();
		ArrayList<Character> firstList = new  ArrayList<>();
		ArrayList<Character> secondList = new ArrayList<>();
		ArrayList<Character> outputList = new ArrayList<>();
		boolean check = true;
		char space = ' ';
		
		for (int i = 0; i < firstLetter.length(); i++) {
			char tmp = firstLetter.charAt(i);
			firstList.add(tmp);
			outputList.add(tmp);
		}
		
		for (int i = 0; i < secondLetter.length(); i++) {
			char tmp = secondLetter.charAt(i);
			secondList.add(tmp);
			
			for (int j = 0; j < firstList.size(); j++) {
				if (tmp == firstList.get(j)) {
					check = false;
				}
			}
			
			if (true == check) {
				outputList.add(space);
				outputList.add(tmp);
			}
			
			check = true ;
		}
		
		for (Character character : outputList) {
			System.out.print(character);
		}
	}

}
