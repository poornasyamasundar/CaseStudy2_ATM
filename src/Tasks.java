public interface Tasks {
	public void withdrawCash( BankCustomer customer );
	public void depositCash( BankCustomer customer );
	public void changePin( BankCustomer customer );
	public void showDetails( BankCustomer customer );
}
