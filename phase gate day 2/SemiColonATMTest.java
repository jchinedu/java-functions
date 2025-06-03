import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SemiColonATMTest {
@Test
public void ATMtest() {
SemiColonATM dec = new SemiColonATM();
dec.withdraw(4.2, 3.9); 
    }
@Test
public void ATMtestthatitworks() {
SemiColonATM dec = new SemiColonATM();
dec.withdraw(1000, 500);

    }

}
