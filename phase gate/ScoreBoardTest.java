import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ScoreBoardTest {
@Test
public void CheckTheArrayissummed() {
	ScoreBoard ran = new ScoreBoard();
	int[][] input = {{3,3,4},{9,1,3}}; 
	int[] actual = ran.totalElementInAnArray(input);
	int[] expected = {10, 13};
	assertArrayEquals(expected, actual);  
    }
@Test
public void checkfornegativevalues() {
	ScoreBoard ran = new ScoreBoard();
	int[][] input = {{-3,-3,-4},{9,1,3}}; 
	int[] actual = ran.totalElementInAnArray(input);
	int[] expected = {-10, 13};
	assertArrayEquals(expected, actual);  
    }
@Test
public void checkforzeros(){
        ScoreBoard ran = new ScoreBoard();
	int[][] input = {{0,0,0},{0,0,0}}; 
	int[] actual = ran.totalElementInAnArray(input);
	int[] expected = {0, 0};
	assertArrayEquals(expected, actual);  
    }
@Test
public void checkfortheaveragenumbers() {
	ScoreBoard ran = new ScoreBoard();
	int[][] input = {{3,3,4},{9,1,3}}; 
	double[] actual = ran.calculateAverage(input);
	double[] expected = {3.3333333333333335, 4.333333333333333};
	assertArrayEquals(expected, actual);  

}
	
@Test
public void checkfortheaverageofnegativenumbers() {
	ScoreBoard ran = new ScoreBoard();
	int[][] input = {{-3,-3,-4},{9,1,3}}; 
	double[] actual = ran.calculateAverage(input);
	double[] expected = {-3.3333333333333335, 4.333333333333333};
	assertArrayEquals(expected, actual);  

}
@Test
public void checkforzeroaverage() {
	ScoreBoard ran = new ScoreBoard();
	int[][] input = {{0,0,0},{0,0,0}}; 
	double[] actual = ran.calculateAverage(input);
	double[] expected = {0, 0};
	assertArrayEquals(expected, actual);  

}


	

}

