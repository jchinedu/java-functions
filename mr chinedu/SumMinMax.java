public class SumMinMax{

	public static int[] minMax(int[] number) {
		int min = number[0];
		int max = number[0];
		for(int i = 1; i < number.length; i++) {
		    if(number[i] < min) {
		      min = number[i];
	
			}
		    if(number[i] > max) {
			max = number[i]; 
			}
	
		}
		int [] difference = {max - min};
		return difference;
}
}