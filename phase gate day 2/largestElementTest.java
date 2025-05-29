import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class largestElementTest {
@Test
public void testThatindexOfOccurenceFunctionexist() {
largestElement check = new largestElement();
int [] input = {1,2,3,4,5,5,6};
int expected = 6;
assertEquals(expected, check.indexOfOccurence(input));  
    }
}
