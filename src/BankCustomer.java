public class BankCustomer {
	private String name = "";
	private int accountNumber = 0;
	private int pin = 0;
	private double balance = 0;
	
	BankCustomer( String name , int accountNumber , int pin , double balance )
	{
		if( !name.equals("") )
			this.name = name;
		if( accountNumber > 9999 && accountNumber < 100000 )
			this.accountNumber = accountNumber;
		if( pin > 999 && pin < 10000 )
			this.pin = pin;
		if( balance >= 0 )
			this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPin()
	{
		return pin;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setPin( int pin )
	{
		if( pin > 999 && pin < 10000 )
			this.pin = pin;
	}
	
	public void setBalnace( double balance )
	{
		if( balance >= 0 )
			this.balance = balance;
	}
}
