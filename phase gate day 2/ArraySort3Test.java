import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ArraySort3Test {
@Test
public void testThatthesortingFunctionworks() {
ArraySort3 check = new ArraySort3();
int [] input = {1,2,3,4,5,5,6};
int [] input2 = { 41, 45, 45, 33};
int [] expected = {45,45,41,33,6,5,5,4,3,2,1};
assertArrayEquals(expected, check.sortingArray(input, input2));  
    }
}
