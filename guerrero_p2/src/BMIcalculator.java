package guerrero_p2;

import java.util.Scanner;

public class BMIcalculator {
	
	private double weight;
	private double height;
	static int selection;
	private double bmiVAlue;
	private double bmiCategory;
	private Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner data = new Scanner(System.in);
	
		
		    BMIcalculator app = new BMIcalculator();
		    app.readUserData();
		    app.calculateBmi(selection);
		    app.displayBmi();
		

	}
	
	//ask the user with measurement
	private  void readUserData ()
	{	
		
		System.out.println("   please choice what type of unit of measurement do you want use");
		System.out.println("    1)    please choice  for pounds and inches");
		System.out.println("    2)   please choice for Kilograms and meters");
	    selection = in.nextInt();
		selectionUnit(selection);
		
	
	}
	
	// select the user choice
	public void selectionUnit(int selection)
	{
		switch(selection)
		{
		case 1:
			readImperialSelection();
			break;
			
		case 2:
			
			readMetricSelection();
			break;
			
		default:
			System.out.println("error entry");
			break;
			
		}
//
		
	}
	
	// imperial method
	private void readImperialSelection()
	{
		
		System.out.println("please enter your weight in pounds: ");
		setweight(in.nextDouble());

		
		System.out.println("please enter your height in inches: ");
		setheight(in.nextDouble());	
		
	}
	
// metric method
	private void readMetricSelection()
	{
		
		System.out.println("please enter your weight in kilograms: ");
		setweight(in.nextDouble());

		
		System.out.println("please enter your height in  meters: ");
		setheight(in.nextDouble());
		
	}
	
	// calculate the bmi
	public void calculateBmi(int selection)
	{
		double weight = getweight();
		double height = getheight();
		

		switch(selection)
		{
		
		case 1:
				bmiVAlue =(703* weight)/ ((Math.pow(height, 2)));
				System.out.println("the bmivalue is "+bmiVAlue);
				break;
			
		case 2:
				bmiVAlue =((weight)/(Math.pow(height, 2)));
				System.out.println("the bmivalue is "+bmiVAlue);
				break;
		default:
			break;
		}
		
		
	
		
		
		 getBmiCategory(bmiVAlue);
		
			
		
	}
	// obtain info of the BMI
	public void getBmiCategory(double bmiTotal)
	{
	
		if (bmiTotal< 18.5)
		{
			System.out.println("Underweight");
			
		}
		else if (bmiTotal<24.9)
		{
			System.out.println("Normal weight");
		}
		else  if (bmiTotal<29.9)
		
		{
			System.out.println("Overweight");
			
		}
		else if (bmiTotal>29.9)
		{
			System.out.println("Obesity");
		}
			
//	
	}
	
	public void displayBmi()
	{
		System.out.println("BMI Categories: ");
//		
			System.out.println("     Underweight = <18.5\n" ) ;
			System.out.println("     Normal weight = 18.5–24.9 \n");
			System.out.println("	 Overweight = 25–29.9 \n");  
			System.out.println("    Obesity = BMI of 30 or greater");
	}
	
	
	
	// group of setter and getter
	private void setweight(double value)
	
	{
		if (value>0)
		{
			weight = value;
			
		}
		else 
			System.out.println("error ");
			return;
		
	}
	private void setheight(double value)
	{
		if (value>0)
		{
			height = value;
		}
		else 
			System.out.println("error ");
		return;
		
	}
	
	public double getweight()
	{
		return weight;
	}
	
	public double getheight()
	{
		return height;
	}


}



