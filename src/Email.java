import java.util.Scanner;

public class Email {
	private static final String emailCondition = "[a-z0-9.]+@[a-z0-9.]+\\.[a-z]{2,}";
	
	public static String email() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Email ID : ");
		String email = scanner.nextLine();
		CheckCondition.checkCondition(email,emailCondition);
		if(CheckCondition.checkCondition(email,emailCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format : eg. abc.xyz@bl.co.in");
			Email.email();
			}
		return emailCondition;
	}
}
