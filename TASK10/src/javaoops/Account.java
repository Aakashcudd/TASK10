package javaoops;

public class Account {
		
		    private double balance;

		    // No-argument constructor
		    public Account() {
		        this.balance = 0.0;
		    }

		    // Constructor with two arguments
		    public Account(double initialBalance) {
		        this.balance = initialBalance;
		    }

		    // Method to deposit into the account
		    public void deposit(double amount) {
		        if (amount > 0) {
		            this.balance += amount;
		            System.out.println("Deposit successful. New balance: " + this.balance);
		        } else {
		            System.out.println("Invalid deposit amount.");
		        }
		    }

		    // Method to withdraw from the account
		    public void withdraw(double amount) {
		        if (amount > 0 && amount <= this.balance) {
		            this.balance -= amount;
		            System.out.println("Withdrawal successful. New balance: " + this.balance);
		        } else {
		            System.out.println("Insufficient funds or invalid withdrawal amount.");
		        }
		    }

		    // Getter method for balance (optional)
		    public double getBalance() {
		        return this.balance;
		    }

		    public static void main(String[] args) {
		        // Example usage of the Account class
		        Account account1 = new Account(); // Creating an account with zero balance
		        System.out.println("Current balance: " + account1.getBalance());

		        account1.deposit(100.0); // Depositing 100.0
		        account1.withdraw(30.0); // Withdrawing 30.0
		        account1.withdraw(100.0); // Attempting to withdraw more than balance

		        Account account2 = new Account(500.0); // Creating an account with initial balance of 500.0
		        System.out.println("Current balance: " + account2.getBalance());

		        account2.deposit(200.0); // Depositing 200.0
		        account2.withdraw(700.0); // Attempting to withdraw more than balance
		    }

	}


