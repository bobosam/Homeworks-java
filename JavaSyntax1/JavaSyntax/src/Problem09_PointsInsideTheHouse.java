import java.util.Locale;
import java.util.Scanner;


public class Problem09_PointsInsideTheHouse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
			
		System.out.print("Point X Y --> ");
		double pointX = input.nextDouble();
		double pointY = input.nextDouble();
		boolean check = false ;
				
		boolean firstTriangleLine = isRight(pointX, pointY, 12.5, 8.5, 17.5, 3.5);
		boolean secondTriangleLine = isRight(pointX, pointY, 17.5, 3.5, 22.5, 8.5);
		boolean thirthTriangleLine = isRight(pointX, pointY, 22.5, 8.5, 12.5, 8.5);
		boolean triangle = firstTriangleLine && secondTriangleLine && thirthTriangleLine;
		boolean leftRectangle = checkInside (pointX, pointY, 12.5, 17.5, 8.5, 13.5);
		boolean rightRectangle = checkInside (pointX, pointY, 20, 22.5, 8.5, 13.5);
		
		check = triangle || leftRectangle || rightRectangle;
		if(check == true) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}

	public static boolean isRight(double pointX, double pointY, double aX,
			double aY, double bX, double bY) {
		boolean check = false;
		if(((bX - aX) * (pointY - aY) - (bY - aY) * (pointX - aX)) >= 0) {
			check = true ;
		}
		return check ;
	}
	

	public static boolean checkInside(double pointX, double pointY,
									double minX, double maxX,
									double minY, double maxY) {
		boolean check ;
		if (pointX >= minX && pointX <= maxX && pointY >= minY && pointY <= maxY){
			check = true;
		}
		else {
			check = false ;
		}
		return check;
	}

}
