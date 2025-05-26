import java.util.Arrays;
public class ArraySort2{

public static int [] sortingArray(int [] number){


for(int index = 0; index < number.length; index++){

 for(int j = index + 1; j < number.length; j++){

      if(number[index] > number[j]){

	int temp = number[index];
	number[index] = number[j];
	number[j] = temp;
		}

}
	}
	return number;
}
public static int[] squareNumbersIn (int[] arrayOfIntegers) {
   int[] square = new int[arrayOfIntegers.length];
   for(int i=0; i < arrayOfIntegers.length; i++) {
	 square[i] = arrayOfIntegers[i] * arrayOfIntegers[i];
}
	return square;
}
public static void main(String[] args) {
int[] number = {0,2,-100,0,67};
int[] square = squareNumbersIn (number);
System.out.print(Arrays.toString(sortingArray(square)));
}
}