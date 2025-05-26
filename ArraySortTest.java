import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ArraySortTest {
@Test
public void CheckTheArraySortIsSquared() {
	ArraySort2 ran = new ArraySort2();
	int[] input = {5,6,10,15,20}; 
	int[] actual = ran.squareNumbersIn(input);
	int[] check = ran.sortingArray(actual);
	int[] expected = {25, 36, 100, 225, 400};
	assertArrayEquals(expected, check);  
    }

	@Test
	public void CheckTheArrayIsSquared() {
	ArraySort2 ran = new ArraySort2();
	int[] input = {0,0,10,-5,20}; 
	int[] actual = ran.squareNumbersIn(input);
	int[] check = ran.sortingArray(actual);
	int[] expected = {0, 0, 25, 100, 400};
	assertArrayEquals(expected, check);  
    }


}

