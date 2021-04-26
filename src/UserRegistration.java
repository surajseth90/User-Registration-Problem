import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		CheckCondition.firstName(firstName);	
	}
}
