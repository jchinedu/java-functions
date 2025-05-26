import java.util.Arrays;
public class ArraySort{

public static int [] sortingArray(int [] number){


for(int index = 0; index < number.length; index++){

 for(int j = index + 1; j < number.length; j++){

      if(number[index] > number[j]){

	int temp = number[index];
	number[index] = number[j];
	number[j] * number[j] = temp;
		}

}

	}


	return number;


	}


public static void main(String[] args){
 int [] input = {7,2,9,3,0};
System.out.print(Arrays.toString(sortingArray(input)));
}

}