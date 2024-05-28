public class Account {
    private String accountNumber;
    private double balance;
    private boolean active;

    public Account() {
		super();
    }
    
    public Account(final String accountNumber, final double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.active = true;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void setActive(boolean active) {
        this.active = active;
    }

    public void addToBalance(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    
    public void subtractFromBalance(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }

    
    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", active=" + active + "]";
    }
}
