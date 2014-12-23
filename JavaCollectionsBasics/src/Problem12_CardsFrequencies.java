import java.util.ArrayList;
import java.util.Scanner;


public class Problem12_CardsFrequencies {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Cards --> ");
		String cards = input.nextLine();
		String[] faces = cards.split("([♥♦♣♠]\\s?)");
		ArrayList<String> listFaces = new ArrayList<>();
		boolean check = true ;
		int counter = 0 ;
		
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < faces.length; j++) {
				
				if (faces[i].equals(faces[j])) {
					counter ++;
				}
			}
			
			for (int j = 0; j < listFaces.size(); j++) {
				String tmp = listFaces.get(j);
				if (faces[i].equals(tmp)) {
					check = false;
				}
			}
			
			if (check == true) {
				listFaces.add(faces[i]);
				double frequencies = (100f * counter) / faces.length ;
				System.out.printf("%s -> %.2f", faces[i],frequencies);
				System.out.println();
				frequencies =0f ;
				counter = 0;
			}
		}
	}
}
