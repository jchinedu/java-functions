import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {
@Test
public void testsquare() {
 Arithmetic arithmetic = new Arithmetic();
assertEquals(6*6, arithmetic.square(6));  
}
 }