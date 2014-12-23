import java.util.Locale;
import java.util.Scanner;

public class Problem03_PointsInsideAFigure {

		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter X Y -->");
			double pointX = input.nextDouble();
			double pointY = input.nextDouble();
			
			boolean firstCheck = checkInside(pointX, pointY, 12.5, 22.5, 6, 8.5);
			boolean secondCheck = checkInside(pointX, pointY, 12.5, 17.5, 8.5, 13.5);
			boolean thirdCheck = checkInside(pointX, pointY, 20, 22.5, 8.5, 13.5);
			
			if (firstCheck == true || secondCheck == true || thirdCheck == true){
				System.out.println("Inside");
			}
			else {
				System.out.println("Outside");
			}
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
