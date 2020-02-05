package guerrero_p1;

public class Decrypter {
	
	public int decryp(int number)
	{
		int [] arraynum = new int [4];
		// decryp the numbers
		
		
		int help_change;
		
		int help1,help2,help3,help4;
		//first number
		 help1= number/1000;
		
		 arraynum[0]= help1;
		
		help2= (number/100)%10;
		
		arraynum[1] = help2;
		
		help3= (number/10)%10%10;
		
		arraynum[2] = help3;
		
		 help4= number%10;
		
		 arraynum[3] = help4;
		
		/// change positions
		
		///add to new array
		
		help_change = arraynum[0];
		
		arraynum[0] = arraynum[2];
		arraynum[2]  = help_change;
		
		
		help_change = arraynum[1];
		arraynum[1] = arraynum[3];
		arraynum[3] = help_change;
	
		
		
		for (int p=0; p<arraynum.length; p++)
		{
			
			
			// it give the last digit 
			
			//System.out.println(" "+encryNum[p] + " ");
			if (arraynum[p]<7)
			{
				arraynum[p]= (arraynum[p]+3);
				
			}
			else
			{ 
				{
				arraynum[p]= (arraynum[p]-7);
				
				}
			}
			
			
			//System.out.print(" "+arraynum[p] + " ");
			
		}
		
		///back to the int variable
		help1 = arraynum[0];
		help2 = arraynum[1];
		help3 = arraynum[2];
		help4 = arraynum[3];
		System.out.print("The original input number is  :  ");
		for (int i = 0; i < 4; i++)
			System.out.print( "--"+arraynum[i]+"--");
		System.out.println();
		
		number = (help1*1000)+(help2*100)+(help3*10)+help4;
		
		return number;
		
		

}
}
