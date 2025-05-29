public class largestElement{
 public static int indexOfOccurence(int[] number){
	int index = 0;
	int max = number[0];
     for (int i = 0; i < number.length; i++) {
	if(number[i] > max){
	 max = number[i];
	 index = i;
	}
	
}
	return index;
}
public static void main(String[] args){
int[] input = {1,2,3,4,4,4,5,5,5,2};
System.out.print(indexOfOccurence(input));
}
}
	