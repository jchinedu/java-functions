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
	}
        
	
