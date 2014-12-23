import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem08_ExtractEmails {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Text --> ");
		String text = input.nextLine();
		//this pattern is not mine.
		Pattern emailPatern = Pattern.compile("[a-zA-Z0-9]+[\\.\\_\\-?a-zA-Z0-9]+@+[a-zA-Z0-9]+[\\.\\-?[a-zA-Z0-9]+\\\\b");
		Matcher matcher = emailPatern.matcher(text);
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
