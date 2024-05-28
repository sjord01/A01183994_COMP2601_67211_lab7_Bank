import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

    private Customer customer1;
    private Customer customer2;
    private Account account;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        // Code to set up any resources required for the entire test class
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        // Code to clean up any resources used by the entire test class
    }

    @BeforeEach
    void setUp() throws Exception {
        customer1 = new Customer();
        customer2 = new Customer("Beyonce", "Carter", "R3nai$$anc3");
        account = new Account("111111", 1000.0);
    }

    @AfterEach
    void tearDown() throws Exception {
        customer1 = null;
        customer2 = null;
        account = null;
    }

    @Test
    void testDefaultConstructor() {
        assertNotNull(customer1);
        assertNull(customer1.getFirstName());
        assertNull(customer1.getLastName());
        assertNull(customer1.getPasscode());
        assertNull(customer1.getAccount());
    }

    @Test
    void testParameterizedConstructor() {
        assertNotNull(customer2);
        assertEquals("Beyonce", customer2.getFirstName());
        assertEquals("Carter", customer2.getLastName());
        assertEquals("R3nai$$anc3", customer2.getPasscode());
    }

    @Test
    void testSetAndGetFirstName() {
        customer1.setFirstName("Shaboozey");
        assertEquals("Shaboozey", customer1.getFirstName());
    }

    @Test
    void testSetAndGetLastName() {
        customer1.setLastName("Gambino");
        assertEquals("Gambino", customer1.getLastName());
    }

    @Test
    void testSetAndGetPasscode() {
        customer1.setPasscode("2Hands2Heaven");
        assertEquals("2Hands2Heaven", customer1.getPasscode());
    }

    @Test
    void testSetAndGetAccount() {
        customer1.setAccount(account);
        assertEquals(account, customer1.getAccount());
    }

    @Test
    void testToString() {
        customer2.setAccount(account);
        String expected = "Customer [firstName=Beyonce, lastName=Carter, passcode=R3nai$$anc3, account=" + account.toString() + "]";
        assertEquals(expected, customer2.toString());
    }
}