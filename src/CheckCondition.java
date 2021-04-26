import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCondition {
	
	public static boolean checkCondition(String userInput,String regex) {
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(userInput);
		boolean result = matcher.matches();
		return result;
	}
	
	public static String firstName() {
		Scanner scanner = new Scanner(System.in);
		String firstNameCondition = "[A-Z][a-z]{3,}";
		System.out.println("Enter your first name : ");
		String firstName = scanner.nextLine();
		CheckCondition.checkCondition(firstName,firstNameCondition);
		if(CheckCondition.checkCondition(firstName,firstNameCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) "+"\n");
			CheckCondition.firstName();
			}
		return firstNameCondition;
	}
	
	public static String lastName() {
		Scanner scanner = new Scanner(System.in);
		String lastNameCondition = "[A-Z][a-z]{3,}";
		System.out.println("Enter your last name : ");
		String lastName = scanner.nextLine();
		CheckCondition.checkCondition(lastName,lastNameCondition);
		if(CheckCondition.checkCondition(lastName,lastNameCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) " +"\n");
			CheckCondition.lastName();
		}
		return lastNameCondition;
	}
}
