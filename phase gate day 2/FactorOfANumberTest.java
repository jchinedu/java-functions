import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorOfANumberTest {
@Test
public void testThatthefactorofFunctionexist() {
       FactorOfANumber.factorsOf(24);
    }
@Test
public void testThatthefactorofFunctionworks() {
      FactorOfANumber check = new FactorOfANumber();
int expected = 2;
assertEquals(expected, check.factorsOf(7));  
    }
@Test
public void testThatthefactornumbersofFunctionexist() {
       FactorOfANumber.factorsOf(24);
    }


    }

