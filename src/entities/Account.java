package entities;

public class Account {
	
	private int accountNumber;
	private String holder;
	private double balance;
	
	//////////////////////////////////////////INÍCIO CONSTRUTORES//////////////////////////////////////////
		
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Account(int accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit); //ESSE deposit É DO MÉTODO CRIADO LÁ EM BAIXO, ELE ESTÁ RECEBENDO O initialDeposit COMO PARAMETRO
	}
	
	////////////////////////////////////////INÍCIO GETTERS E SETTERS////////////////////////////////////////
	
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
	
	//////////////////////////////////////////INÍCIO MÉTODOS//////////////////////////////////////////
	
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
