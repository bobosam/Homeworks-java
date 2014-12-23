import java.util.Scanner;

public class Problem06_SumTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("a=");
		int a = input.nextInt();
		System.out.print("b=");
		int b = input.nextInt();
		
		System.out.printf("%d + %d = %d%n", a, b, a+b);
	}

}
