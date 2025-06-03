import java.util.Arrays;
public class RotateImage{
public static int[][] Clockwise(int[][] numbers) {

int[][] totals = new int[numbers[0].length][numbers.length];
        for (int i =0; i < numbers[0].length; i++) {
        for (int count = 0; count < numbers.length; count++){
		totals[i][count] =  numbers[numbers.length - count -1][i];
	}
	}
	
		return totals;
	}
public static void main(String[] args) {
int [] [] input = {{1,2,3},{4,5,6},{7,8,9}};
System.out.print(Arrays.deepTboString(Clockwise(input))); 
	}
}
        
	
