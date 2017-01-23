import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user=new Scanner (System.in);
		System.out.println("Please type in a place");
		String place1=user.nextLine();
		System.out.println("Please type in a adjective");
		String adjective1=user.nextLine();
		System.out.println("Please type in a past tense verb");
		String pasttenseverb1=user.nextLine();
		System.out.println("Please type in a number");
		String number1=user.nextLine();
		System.out.println("Please type in an another number");
		String number2=user.nextLine();
		
		
		
		
		System.out.println("Two friends went to the "+place1+" and they "
				+ "saw a(n) "+adjective1+" dog.");
		//System.out.println("They saw a(n) "+adjective1+" dog.");
		System.out.println("The "+adjective1+" dog "+pasttenseverb1+" away.");
		System.out.println("The two friends left the "
		+adjective1+" dog and "+pasttenseverb1 + " " + number1+" miles home");
		System.out.println(number2 + " day(s) later, the two friends saw the "+adjective1+" dog again.");

	}

}
