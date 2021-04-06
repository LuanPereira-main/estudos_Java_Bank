package entities;

public class Account {
	
	private int accountNumber;
	private String holder;
	private double balance;
	
	//////////////////////////////////////////IN�CIO CONSTRUTORES//////////////////////////////////////////
		
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit); //ESSE deposit � DO M�TODO CRIADO L� EM BAIXO, ELE EST� RECEBENDO O initialDeposit COMO PARAMETRO
	}
	
	////////////////////////////////////////IN�CIO GETTERS E SETTERS////////////////////////////////////////
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String name) {
		this.holder = name;
	}

	public double getBalance() {
		return balance;
	}
	
	//////////////////////////////////////////IN�CIO M�TODOS//////////////////////////////////////////
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5.0;
	}
	
	//////////////////////////////////////////toString//////////////////////////////////////////
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f%n", balance);
				
	}
	
}
