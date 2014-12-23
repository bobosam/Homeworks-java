import java.util.Scanner;

public class Problem02_TriangleArea {

 	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("point A --> X Y ");
		int pointAX = input.nextInt();
		int pointAY = input.nextInt();
		System.out.print("point B --> X Y ");
		int pointBX = input.nextInt();
		int pointBY = input.nextInt();
		System.out.print("point C --> X Y ");
		int pointCX = input.nextInt();
		int pointCY = input.nextInt();
		
		double area = triangleArea(pointAX, pointAY, pointBX, pointBY, pointCX,
				pointCY);
		
		System.out.printf("Triangle area = %.2f", area);
	}

	public static double triangleArea(int pointAX, int pointAY, int pointBX,
								      int pointBY, int pointCX, int pointCY) {
		
		double area =Math.abs(((double)((pointAX * (pointBY - pointCY))
										+ pointBX * (pointCY - pointAY)
										+ pointCX * (pointAY - pointBY))) / 2);
		return area;
	}
}
