import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
  public class SecondHighestTest {

    @Test
    public void testForCorrectAnswe() {
        ClassTaskSecondLargest high = new ClassTaskSecondLargest();
        int[] input = {5,6,10,15,20}; 
        int range = high.SecondLargest(input);
	int check = 15;

        assertEquals(check, range);
    }
  }
