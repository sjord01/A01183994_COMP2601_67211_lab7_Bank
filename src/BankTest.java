import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankTest {

    private Bank bank;
    private Customer customer1;
    private Customer customer2;
    private Customer customer3;
    private Customer customer4;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        bank = new Bank();
        customer1 = new Customer("John", "Doe", "pass123");
        customer2 = new Customer("Jane", "Doe", "pass456");
        customer3 = new Customer("Jim", "Beam", "pass789");
        customer4 = new Customer("Jack", "Daniels", "pass012");
        
        customer1.setAccount(new Account("111111", 1000.0));
        customer2.setAccount(new Account("222222", 2000.0));
        customer3.setAccount(new Account("333333", 3000.0));
        customer4.setAccount(new Account("444444", 4000.0));
    }

    @AfterEach
    void tearDown() throws Exception {
        bank = null;
        customer1 = null;
        customer2 = null;
        customer3 = null;
        customer4 = null;
    }

    @Test
    void testAddCustomer() {
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        assertEquals(2, Bank.theBank.size());
        assertTrue(Bank.theBank.containsKey("111111"));
        assertTrue(Bank.theBank.containsKey("222222"));
    }

    @Test
    void testCloseAccount() {
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.closeAccount("111111");

        assertEquals(1, Bank.theBank.size());
        assertFalse(Bank.theBank.containsKey("111111"));
        assertTrue(Bank.theBank.containsKey("222222"));
    }

    @Test
    void testDisplayCustomerInformation() {
        bank.addCustomer(customer1);
        
        Bank.displayCustomerInformation(customer1);
    }

    @Test
    void testDisplayAllCustomers() {
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        Bank.displayAllCustomers();
    }

    @Test
    void testAddCustomerWithNullAccount() {
        Customer customerWithNullAccount = new Customer("Null", "Account", "nopass");
        customerWithNullAccount.setAccount(null);

        bank.addCustomer(customerWithNullAccount);

        assertFalse(Bank.theBank.containsValue(customerWithNullAccount));
    }
}