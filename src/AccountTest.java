import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AccountTest {

    Account account1;
    Account account2;
    Account account3;
    Account account4;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        account1 = new Account(null, 100.0);
        account2 = new Account("", 200.0);
        account3 = new Account("123456", 300.0);
        account4 = new Account("789012", 400.0);
    }

    @AfterEach
    void tearDown() throws Exception {
        account1 = null;
        account2 = null;
        account3 = null;
        account4 = null;
    }

    @Test
    void testAccountInitialization() {
        assertNotNull(account1);
        assertNotNull(account2);
        assertNotNull(account3);
        assertNotNull(account4);
        
        assertNull(account1.getAccountNumber());
        assertEquals("", account2.getAccountNumber());
        assertEquals("123456", account3.getAccountNumber());
        assertEquals("789012", account4.getAccountNumber());
        
        assertEquals(100.0, account1.getBalance());
        assertEquals(200.0, account2.getBalance());
        assertEquals(300.0, account3.getBalance());
        assertEquals(400.0, account4.getBalance());
    }
    
    @Test
    void testAddToBalance() {
        account1.addToBalance(50.0);
        account2.addToBalance(50.0);
        account3.addToBalance(50.0);
        account4.addToBalance(50.0);

        assertEquals(150.0, account1.getBalance());
        assertEquals(250.0, account2.getBalance());
        assertEquals(350.0, account3.getBalance());
        assertEquals(450.0, account4.getBalance());
    }
    
    @Test
    void testSubtractFromBalance() {
        account1.subtractFromBalance(50.0);
        account2.subtractFromBalance(50.0);
        account3.subtractFromBalance(50.0);
        account4.subtractFromBalance(50.0);

        assertEquals(50.0, account1.getBalance());
        assertEquals(150.0, account2.getBalance());
        assertEquals(250.0, account3.getBalance());
        assertEquals(350.0, account4.getBalance());
    }
    
    @Test
    void testSetAndGetActive() {
        account1.setActive(false);
        account2.setActive(false);
        account3.setActive(true);
        account4.setActive(true);

        assertFalse(account1.isActive());
        assertFalse(account2.isActive());
        assertTrue(account3.isActive());
        assertTrue(account4.isActive());
    }
}

