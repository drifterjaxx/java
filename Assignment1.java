/**
 * Assignment 1
 * In order to both validate input values and the ticker for extra credit,
 * I used while loops to flag as false and re prompt for incorrect values
 */
import java.util.Scanner;

public class Assignment1 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); //Create scanner object
		
		
		//Ask for investment amount and validates
		System.out.println("Enter amount of money you are willing to invest: ");
		double principal = keyboard.nextDouble(); // Declares amount available as double for calculation
		while (principal <= 0) {
			System.out.println("Invalid input, try again.");
			principal = keyboard.nextDouble();
		}

		//Ask for stock ticker
		System.out.println("Enter stock ticker: ");
		String stockTicker = keyboard.next();
		int length = stockTicker.length(); 
		while (length >= 6) {
			System.out.println("Invalid input, try again.");
			stockTicker = keyboard.next();
			length = stockTicker.length(); 
		}
		
		//Asks for stock price
		System.out.println("Enter stock price: ");
		double price = keyboard.nextDouble();
		while (price <= 0.00)
		{
			System.out.println("Invalid input, try again.");
			price = keyboard.nextDouble();
		}
		
		//Asks for P/E value
		System.out.println("Enter P/E ratio: ");
		double peRatio = keyboard.nextDouble(); //Declares the price-to-earnings ratio as double for calculations
		while (peRatio <= 0.0) // While loop used as validation method
		{
			System.out.println("Invalid input, try again.");
			peRatio = keyboard.nextDouble();
		}
		
		//Displays results including warnings
		System.out.println("Below are your results: \n");
		System.out.println("Stock: " + stockTicker);
		System.out.println("Price: $" + price);
		System.out.println("P/E Ratio: " + peRatio);
		if (peRatio > 60)
			System.out.println("WARNING: This company may be overvalued!");
		int shares = (int) (principal / price);
		System.out.println("# of shares able to purchase: " + shares);
		
	}
}
