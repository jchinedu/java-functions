public class NewSort{
public static int[] sort(int[] numbers) {
		int presentSmallest = Integer.MAX_VALUE;
		int presentIndex = 0;
		
		for (int count = 0; count < numbers.length; count++) {
			presentSmallest = Integer.MAX_VALUE;
			for (int count2 = count; count2 < numbers.length; count2++) {
				if (numbers[count2] <= presentSmallest) {
					presentSmallest = numbers[count2];
					presentIndex = count2;
				}
				
			}
			numbers[presentIndex] = numbers[count];
			numbers[count] = presentSmallest;
		}
		return numbers;
	}
}