import java.util.HashMap;

public class Bank {
    public static HashMap<String, Customer> theBank = new HashMap<>();

    public Bank() {
        theBank = new HashMap<>();
    }

    public void addCustomer(Customer newCustomer) {
        if (newCustomer != null && newCustomer.getAccount() != null) {
            theBank.put(newCustomer.getAccount().getAccountNumber(), newCustomer);
        }
    }

    public void closeAccount(String accountNumber) {
        theBank.remove(accountNumber);
    }

    public static void displayCustomerInformation(Customer customer) {
        if (customer != null) {
            System.out.println(customer.toString());
        }
    }

    public static void displayAllCustomers() {
        for (Customer customer : theBank.values()) {
            System.out.println(customer.toString());
        }
    }
}
