import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class MinMaxTest {
@Test
public void CheckTheArrayOfMinAndMax() {
SumMinMax ran = new SumMinMax();
int[] input = {5,6,10,15,20};
int[] range = ran.minMax(input);
int[] check = {15};
assertArrayEquals(check, range);  
    }
}

