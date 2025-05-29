import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class RotateImageTest {
@Test
public void testThatClockwiseFunctionexist() {
  int[][] input = {{1,2,3},{2,3,4},{3,4,5}};
 RotateImage.Clockwise(input);  
    }
}
