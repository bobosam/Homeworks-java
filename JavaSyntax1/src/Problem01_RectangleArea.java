import java.util.Scanner;


public class Problem01_RectangleArea {

		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("sides --> ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int areaRect = a * b ;
		
		System.out.printf("rectangle area = %d", areaRect);

	}

}
