import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @BeforeEach
    void setUp() {
        Bank.resetBank();
    }

    @Test
    void testCreateAccount() {
        Customer c = Bank.createAccount("Alice", "1234567890");
        assertEquals("Alice", c.getName());
        assertEquals("1234567890", c.getPhoneNumber());
    }

    @Test
    void testGetName() {
        Bank.createAccount("Bob", "1112223333");
        assertEquals(1, Bank.getName().size());
    }

    @Test
    void testDepositValid() {
        double result = Bank.deposit("Bob", 100, 500);
        assertEquals(600, result);
    }

    @Test
    void testDepositInvalidAmount() {
        double result = Bank.deposit("Bob", -50, 500);
        assertEquals(-1, result);
    }

    @Test
    void testWithdrawSuccess() {
        Bank.createAccount("Charlie", "4445556666");
        double newBalance = Bank.withdraw("Charlie", 100, 300);
        assertEquals(200, newBalance);
    }

    @Test
    void testWithdrawNegativeAmount() {
        Bank.createAccount("Dana", "5556667777");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Bank.withdraw("Dana", -100, 300);
        });
        assertEquals("Withdrawal amount must be positive.", e.getMessage());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Bank.createAccount("Ella", "6667778888");
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Bank.withdraw("Ella", 400, 300);
        });
        assertEquals("Insufficient funds.", e.getMessage());
    }

    @Test
    void testWithdrawAccountNotFound() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Bank.withdraw("Ghost", 100, 300);
        });
        assertEquals("Account not found.", e.getMessage());
    }

    @Test
    void testGetAllCustomers() {
        Bank.createAccount("Frank", "7778889999");
        Bank.createAccount("Grace", "8889990000");
        assertEquals(2, Bank.getAllCustomers().size());
    }

    @Test
    void testFindCustomerByNameOrPhone() {
        Bank.createAccount("Helen", "9990001111");
        Customer foundByName = Bank.findCustomer("Helen", "");
        Customer foundByPhone = Bank.findCustomer("", "9990001111");
        assertNotNull(foundByName);
        assertNotNull(foundByPhone);
    }

    @Test
    void testFindCustomerNotFound() {
        Bank.createAccount("Isaac", "1112223333");
        assertNull(Bank.findCustomer("Unknown", "0000000000"));
    }
}
