
package moduleProject;

import java.util.Scanner;

public class tripPlanner {
	
			public static void main(String[] args) {
				
			greetingMethod();
			timeBudget();
			timeDifference();

}
	
			public static void greetingMethod() {
			
				//user interaction/response
				Scanner input = new Scanner (System.in);
				
		//greeting the client with a welcome msg
System.out.println("Welcome to the Vacation Planner !");


System.out.print("What is your name? ");
String name = input.nextLine();
	System.out.print("Nice to meet you "+name);
	System.out.print(", Where are you travelling to? ");
String city = input.nextLine();

				System.out.print("Great! " +city);
				System.out.println(" sounds like a great trip");
System.out.println("***********");
									//	input.close();
			}

			public static void timeBudget() {
				
				Scanner input = new Scanner (System.in); 
				
				
				System.out.print("How many days are you going to spend travelling? ");
				int days = input.nextInt();
				
				
				System.out.print("How much money, in USD, are you planning to spend on your trip? ");
				Double money = input.nextDouble();
				
				System.out.print("What is the three letter currency symbol for your travel destination? ");
				String symbol = input.next();
				System.out.print("How many "+symbol);
					System.out.print(" are there in 1 USD ");
					Double equal = input.nextDouble();
					
					
					//summerizing days code into one line of output
					
					System.out.print("If you are travelling for "+days);
					System.out.print(" days that is the same as " +days * 24);
					System.out.print(" hours or " +days * 1440);
							System.out.println(" minutes");
				
							
							//code for the currenecy and budget
							System.out.print("If you are going to spend $"+money);
							System.out.print(" USD that means per day you can spend up to $"+money / +days);
							System.out.println(" USD");
							System.out.print("Your total budget in "+symbol);
							System.out.print(" is "+money * equal);
							System.out.print(" "+symbol);
							System.out.print(" Which per day is "+money * equal / +days);
							System.out.println(" "+symbol);
							System.out.println("***********");
							
						//	input.close();	
				
				
			}
			
			public static void timeDifference() {
				
				Scanner input = new Scanner (System.in); 
				
				
				System.out.print("What is the time difference, in hours, between your home and your destination? ");
					Double difference = input.nextDouble();
					
					System.out.print("That means that when it is midnight at home it will be " +difference + 12.00);
					System.out.print(" in your travel destination and when is is noon at home it will be  "+difference +12.00 );
					
				
				
				
				
				
				
			}







		


}
