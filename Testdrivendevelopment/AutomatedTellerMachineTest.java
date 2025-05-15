import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AutomatedTellerMachineTest {


 @Test
 public void testCanWithdrawFunds() { 
Account johnsAccount = new Account("john", "0123456789", 50.00);
Account jamesAccount = new Account("James", "9876543210", 50000.00);
Account bolajiAccount = new Account("Bolaji", "9867543210", 500.00);

Account[] accounts = {johnsAccount,jamesAccount,bolajiAccount};
AutomatedTellerMachine atm = new AutomatedTellerMachine();
    atm.setAccounts(accounts);

atm.withdraw(jamesAccount.getAccountNumber(), 20000);
assertEquals(30000,jamesAccount.getBalance());


}
}