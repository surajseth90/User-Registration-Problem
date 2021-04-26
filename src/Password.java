import java.util.Scanner;

public class Password {
	private static final String passwordCondition = "(?=.*[A-Z])[A-Za-z]{8,}";
		
	public static void password() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Password : ");
		String password = scanner.nextLine();
		CheckCondition.checkCondition(password,passwordCondition);
		if(CheckCondition.checkCondition(password,passwordCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ "eg. minimum 8 characters and altleast 1 upper case character ");
			Password.password();
		}
	}	
}
