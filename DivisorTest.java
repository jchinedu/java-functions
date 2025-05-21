import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisorTest {

    @Test
    public void testDivisorFunction() {
        int[] numbers = {10, 3, 4, 2, 5};
        int divisor = 2;
        int[] expectedResult = {10, 4, 2};
        int[] actualResult = NumberDivisor.divisor(numbers, divisor);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivisorFunctionWithNoDivisibleElements() {
        int[] numbers = {7, 11, 13};
        int divisor = 5;
        int[] expectedResult = new int[0];
        int[] actualResult = NumberDivisor.divisor(numbers, divisor);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivisorFunctionAllDivisible() {
        int[] numbers = {10, 20, 30, 40};
        int divisor = 10;
        int[] expectedResult = {10, 20, 30, 40};
        int[] actualResult = NumberDivisor.divisor(numbers, divisor);
        assertArrayEquals(expectedResult, actualResult);
    }
}
