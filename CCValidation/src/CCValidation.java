import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class CCValidation 
{
	public static String number = "0"; 
	
	public static void main(String[] args) 
	{

		Scanner user = new Scanner(System.in);
		System.out.println("Please enter a 16 digit number");
		String cardNumber = user.nextLine(); 
		number = cardNumber; 
		
		isValid(number);
		if (isValid(number)== true)
		{
			System.out.println("That number is valid!");
		}
		else
		{
			System.out.println("That number is invalid!");
		}
		
		
//		try 
//		{
//        File file = new File("CCnumbers");
//        Scanner scanner = new Scanner(file);
//
//        int lineNum = 1;
//        while (scanner.hasNextLine()) 
//        {
//            String number = scanner.nextLine().trim();
//
//            if (number.length() != 16 || !number.matches("\\d{16}")) 
//            {
//                System.out.println("Line " + lineNum + ": INVALID INPUT ");
//            } 
//            else 
//            {
//                boolean isValid = isValid(number);
//                System.out.println("Line " + lineNum + ": " + (isValid ? "VALID" : "INVALID"));
//            }
//            lineNum++;
//        }
//
//        scanner.close();
//		}
//		catch (FileNotFoundException e) 
//		{
//        System.out.println("file not found. Check the name and path.");
//        
//        e.printStackTrace();
//		}
		
		 
		
		
		

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
	

}
