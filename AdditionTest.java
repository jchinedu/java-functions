import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
@Test
public void testAdd() {
Addition addition = new Addition();
assertEquals(15, addition.add(10, 5));  
    }
}
