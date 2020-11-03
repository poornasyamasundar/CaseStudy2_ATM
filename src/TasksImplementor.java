import java.util.Scanner;
public class TasksImplementor implements Tasks {
	Scanner input = new Scanner( System.in );
	
	public void showDetails( BankCustomer b )
	{
		System.out.println("Name : "+b.getName());
		System.out.println("Account Number : "+b.getAccountNumber());
		System.out.println("Balance : "+b.getBalance());
	}
	
	public void withdrawCash( BankCustomer b )
	{
		System.out.println("Enter the amount you want to withdraw ( only in multiples of 100 )");
		double amount = input.nextDouble();
		if( amount > 0 && amount < b.getBalance() && amount <= 100000 && amount % 100 == 0 )
		{
			System.out.println("Please take the cash");
			b.setBalnace( b.getBalance() - amount);
			System.out.println("\n\nThank you");
		}
		else if( amount > 100000 )
			System.out.println("Maximum Amount that can be Withdrawn is only 1,00,000 ;Try Again");
		else
			System.out.println("!!Enter Valid Amount Try Again!!");
		System.out.println();
	}
	
	public void depositCash( BankCustomer b )
	{
		System.out.println("Enter the amount you want to deposit");
		double amount = input.nextDouble();
		if( amount > 0 )
		{
			System.out.println("Place the cash in the Machine");
			b.setBalnace( b.getBalance() + amount );
			System.out.println("\n\nThank you");
		}
		else
			System.out.println("Enter Valid Amount");
		System.out.println();
	}
	
	public void changePin( BankCustomer b )
	{
		System.out.println("Enter your new pin");
		int pin = input.nextInt();
		if( pin == b.getPin() )
		{
			System.out.println("This your excisting pin try new pin");
			changePin(b);
		}
		else if( pin > 999 && pin < 10000 )
		{
			System.out.println("Re Enter the pin again");
			int p = input.nextInt();
			if( p == pin)
				b.setPin(pin);
			else
			{
				System.out.println("Enter correct pin");
				changePin( b );
			}
		}
		else
		{
			System.out.println("Enter Valid 4 digit pin");
			changePin(b);
		}
		System.out.println();
			
		
	}
}
