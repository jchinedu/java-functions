import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SemicolonPayrollTest {
@Test
public void payrolltest() {
SemicolonPayroll  dec = new SemicolonPayroll();
dec.printMenu(); 
    }
@Test
public void employeetest() {
SemicolonPayroll  dec = new SemicolonPayroll();
  dec.viewEmployees();
}
}
