import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Problem01_SortArrayOfNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number N --> ");
		int numberN = input.nextInt();
		int[] inArray = new int[numberN];
		System.out.printf("Enter %d number 1 2 3 ... --> ", numberN);
		
		for (int i = 0; i < numberN; i++) {
			inArray[i] = input.nextInt();
		}
		
		Arrays.sort(inArray);
		for (int number : inArray) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
