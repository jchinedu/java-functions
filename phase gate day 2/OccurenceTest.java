import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OccurenceTest{
@Test
public void testThatCharacterFunctionexist() {
Occurence check = new Occurence();
int expected = 1;
assertEquals(expected, check.Character("hello", 'o'));  
    }
@Test
public void testThatCharacterFunctionworks() {
     Occurence.Character("john", 'j'); 
    }
@Test
public void testThatCharacterFunctionreturnszero() {
     Occurence.Character("john", 'q'); 


}
}
