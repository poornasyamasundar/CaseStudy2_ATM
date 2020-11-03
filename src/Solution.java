import java.util.ArrayList;
import java.util.Scanner;
public class Solution{
	public static ArrayList<BankCustomer> customer = new ArrayList<>(0);
	static Scanner input = new Scanner( System.in );
		
	public static void mainMenu()
	{
		System.out.println("Enter 1 to login using yout Account Number and pin");
		System.out.println("Enter 2 to exit ");
		int i = input.nextInt();
		
		if( i == 1 )
			login();
		else if( i != 2 )
		{
			System.out.println("!!Enter valid Number!!");
			mainMenu();
		}
			
	}
	
	public static void login()
	{
		System.out.println("Enter your 5 digit Account Number");
		int accNumber = input.nextInt();
		boolean bool = false;
		BankCustomer custom = customer.get(0);
		
		for( BankCustomer b : customer )
		{
			if( b.getAccountNumber() == accNumber )
			{
				bool = true;
				custom = b;
				break;
			}
		}
		
		if( bool )
		{
			System.out.println("Enter the 4 digit pin");
			int p = input.nextInt();
			
			if( custom.getPin() == p )
				menu( custom );
			else
			{
				System.out.println("Wrong Pin Number login again");
				mainMenu();
			}
		}
		else
		{
			System.out.println("!!Invalid Account Number!!");
			System.out.println("Login Again");
			mainMenu();
		}
	}
	public static void menu( BankCustomer b)
	{
		Tasks t = new TasksImplementor();
		System.out.println("Enter 1 to view your bank details");
		System.out.println("Enter 2 to Withdraw Money");
		System.out.println("Enter 3 to Deposit Money");
		System.out.println("Enter 4 to change your Pin Number");
		System.out.println("Enter 5 to logout");
		
		int option = input.nextInt();
		
		if( option == 1 )
		{
			t.showDetails(b);
			menu(b);
		}
		else if( option == 2 )
		{
			t.withdrawCash(b);
			menu(b);
		}
		else if( option == 3 )
		{
			t.depositCash(b);
			menu(b);
		}
		else if( option == 4 )
		{
			System.out.println("Enter your existing Pin for Confirmation");
			int pin = input.nextInt();
			if( pin == b.getPin() )
				t.changePin(b);
			else 
				System.out.println("Enter correct pin Try Again");
				menu(b);
		}
		else if( option == 5 )
		{
			System.out.println("Sucessfully logged out");
			mainMenu();
		}
		else
		{	
			System.out.println("Enter valid Numnber");
			menu(b);
		}
	}
	
	public static void main( String[] args )
	{
		System.out.println("welcome to HDFD Bank!");
		customer.add( new BankCustomer("Ram",56894,2356,10000) );
		customer.add( new BankCustomer("Arun Kumar",89756,4589,29563.29) );
		customer.add( new BankCustomer("Rakesh",23589,2020,5123));
		customer.add( new BankCustomer("Geetha",12589,7945,78456));
		customer.add( new BankCustomer("Prasad",78945,8945,1000000));
		customer.add( new BankCustomer("Mahesh",32132,5623,0));
		customer.add( new BankCustomer("Kumar",89564,4512,89466));
		customer.add( new BankCustomer("Chaithanya",12578,1984,49005));
		customer.add( new BankCustomer("Sundar",25793,3287,25000));
		customer.add( new BankCustomer("Sree kanth",65894,2089,79000));
		mainMenu();
	}
}
