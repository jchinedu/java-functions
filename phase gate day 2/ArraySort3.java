import java.util.Arrays;
public class ArraySort3{
public static int [] sortingArray(int [] number, int [] number2){
int [] john = new int [number.length + number2.length];
 for(int i = 0; i < number.length; i++){
   john[i] = number[i];
}
  for(int i = 0; i < number2.length; i++){
   john[i + number.length] = number2[i];
}

 for(int index = 0; index < john.length; index++){

 for(int j = index + 1; j < john.length; j++){

      if(john[index] < john[j]){

	int temp = john[index];
        john[index] = john[j];
	john[j] = temp;
		}

}
	}
	return john;
}

public static void main(String[] args) {
int[] number = {0,2,-100,0,67};
int[] number2= {1,2,3,4,5};
System.out.print(Arrays.toString(sortingArray(number, number2)));
}
}