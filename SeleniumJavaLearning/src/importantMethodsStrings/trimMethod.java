package importantMethodsStrings;

import java.util.Scanner;

public class trimMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter city name");
		String name= sc.nextLine().toLowerCase().trim();
		if(name.equals("hyderbad"))
		{
			System.out.println("welcome to hyderbad");
		}
		else if (name.equals("banglore"))
		{
			System.out.println("welcome to banglore");
		}
		else if(name.equals("chennai"))
		{
			System.out.println("welcome to chennai");
		}
		else
		{
			System.out.println("please enter city name");
		}
		
			
		
		
		

	}

}
