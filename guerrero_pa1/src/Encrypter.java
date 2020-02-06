package guerrero_p1;

public class Encrypter {
	//final int INPUT_SIZE = 4;
	
	
	 public static int encryp(int number)
	{
		
		// Encrypter the numbers
		
		int [] arraynum = new int[4];
		
		int help_change;
		
		int help1,help2,help3,help4=0;
		//first number
		help1 = number/1000;
			
		arraynum[0] = help1;
		//second number
		
		help2 = (number/100)%10;
		
		
		arraynum[1] = help2;
		//third number
		
		help3 = (number/10)%10%10;
		
		
	
		arraynum[2] = help3 ;
		// four number
		
		help4 = number%10;
		
		
		arraynum[3] = help4;

	
	
		//encryonumber
		
		for (int p=0; p<arraynum.length; p++)
		{
			arraynum[p] = (arraynum[p] + 7)%10;
			
			
			//System.out.print("   "+arraynum[p] + " ");
			
			
		}
		//for (int i = 0; i < 4; i++)
		//	System.out.print(arraynum[i]);
		//System.out.println();

	
		
		/// change positions
		
		
		help_change = arraynum[0];
		
		arraynum[0] = arraynum[2];
		arraynum[2] = help_change;
		
		
		help_change = arraynum[1];
		arraynum[1] = arraynum[3];
		arraynum[3]  = help_change;
		
	
		
		
		help1=arraynum[0];
		help2 = arraynum[1];
		help3 = arraynum[2];
		help4 = arraynum[3];
		System.out.print("The new encrypter number is :  ");
		for (int i = 0; i < 4; i++)
			System.out.print( "--"+arraynum[i]+"--");
		System.out.println();
	
		//back to int
		number = help1*1000 +help2*100+help3*10+help4;
		
		return number;
		
		
		
		
		
			
			
		
		 
		
		
		
		
	}
		help3 = (number/10)%10%10;
	
	
	
		
}
