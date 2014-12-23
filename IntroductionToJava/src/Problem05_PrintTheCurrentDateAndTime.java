import java.util.Date;

public class Problem05_PrintTheCurrentDateAndTime {

	public static void main(String[] args) {
		
		Date date =new Date();
		System.out.printf("%1$tA %1$tH:%1$tM:%1$td %1tB %1$tY\n", date);
	}
}
