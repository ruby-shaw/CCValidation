import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class CCValidation 
{
	public static String number = "0"; 
	
	public static void main(String[] args) 
	{
//		Scanner user = new Scanner(System.in);
//		System.out.println("Please enter a 16 digit number");
//		String cardNumber = user.nextLine(); 
//		number = cardNumber; 
		
		
//		File file = new File("CCnumbers.txt");
//		Scanner scanner = new Scanner(file);
//		
//		while(scanner.hasNextLine())
//		{
//			String number = scanner.nextLine();
//		}
		
		
		isValid(number); 
		
		if (isValid(number) == true)
		{
			System.out.println("That number is valid!");
		}
		else
		{
			System.out.println("That number is invalid!");
		}
		
		

	}
	
	public static boolean isValid(String number)
	{
		boolean isValid = false;
		int sum = 0;
		
		String [] array = number.split("");
		
		for (int i = 0; i < number.length(); i++)
		{
			int leftIndex = i; 
			int dub = Integer.parseInt(number.substring(leftIndex, leftIndex +1));
			
			if (i % 2 == 0)
			{
				dub *= 2;
				
				if(dub > 9)
				{
					dub -= 9; 
				}
			}
			
			sum += dub; 
		}
		
		if(sum %10 == 0)
		{
			isValid = true; 
		}
		return isValid;
	
		
		
	}
	
	
	
	
	
//	public static ArrayList<Integer> CCNumbers = new ArrayList<>();
//	public static void getCCNumbers() throws IOException
//	{
//		
//	}
	

}
