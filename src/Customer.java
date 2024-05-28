public class Customer {
    private String firstName;
    private String lastName;
    private String passcode;
    private Account account;

    //public Customer() {
    //   super();
    //}
    
    public Customer() {
        this.firstName = null;
        this.lastName = null;
        this.passcode = null;
        this.account = null; // Ensure account is initialized to null
    }

    public Customer(String firstName, String lastName, String passcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passcode = passcode;
        this.account = new Account();
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getPasscode() {
        return this.passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", passcode=" + passcode + ", account=" + account.toString() + "]";
    }
}
