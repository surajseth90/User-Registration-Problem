import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCondition {
	
	public static boolean checkCondition(String userInput,String regex) {
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(userInput);
		boolean result = matcher.matches();
		return result;
	}
	
	public static String firstName(String firstName) {
		String firstNameCondition = "[A-Z][a-z]{3,}";
		CheckCondition.checkCondition(firstName,firstNameCondition);
		if(CheckCondition.checkCondition(firstName,firstNameCondition))
			System.out.println(firstName);
		else
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) ");
		return firstNameCondition;
	}
}
