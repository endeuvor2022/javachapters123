package guerrero_p1;

import java.util.Scanner;
//planning to used a int number 
//*** look for every single digit for the number
/// put in array
/// swap numbers
/// encrypted
// decrypter
/// back everythingin to integer
public class Application {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		final int INPUT_SIZE = 4;
		
		Scanner in = new Scanner(System.in);
		int number;
		
		
		Encrypter encrypter = new Encrypter();
		
		Decrypter decrypter = new Decrypter();
		
		
		System.out.println ("Please enter a 4 digit number,");
		
		number = in.nextInt();
		
		
		number = encrypter.encryp(number);
	//	number = Encrypter.encryp(number);
		
		
		System.out.println("");
		
		
		
		 System.out.println("please enter the encrypter number");
		 number = in.nextInt();
		 System.out.println("");
		 
		 number = decrypter.decryp(number);
	

		
		
			
			
		
		
		
		
}
	
}
