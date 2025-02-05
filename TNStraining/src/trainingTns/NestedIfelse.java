package trainingTns;
import java.util.*;

public class NestedIfelse {

	public static void main(String[] args) {
		//Set Username and Password
		String Username="Mahek123";
		String Password="123mahek";


		Scanner sc = new Scanner(System.in);

		// Asking for user input
		System.out.print("Enter your Username: ");
		String name = sc.nextLine(); // Read a line of text (string)

		if(name.equals(Username)) {
			System.out.println("Correct Username ");
			
			System.out.println("Enter your Password: ");
			String pswd = sc.nextLine();
			
			if(pswd.equals(Password)) 
			{
				System.out.println("Correct Password");
				System.out.println("Welcome to TNS ");}
			else {
				System.out.println("Incorrect Password Try again ");
					}
		}	

		else {
			System.out.print("Incorrect Username , Try Again!! ");
		}
			
	}

}
