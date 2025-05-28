import java.util.Arrays;
public class PhaseOpe {
 public static int john(int[] number) {
	int count = 0;
	int counter = 0;
	for (int i = 0; i < number.length; i++) {
		count = 0;
	     for(int j = 0; j < number.length; j++) {
	         if (number[i] == number[j]) {
		  count++;
		}
		
		}
	if(count == 1) {
		counter++;
		
}
}
	return counter;	
}
public static int[] ArrangeArray(int[] Number) {
	int[] Numbers = new int [john(Number)];
	int counter = 0;
        for(int i = 0; i < Number.length; i++) {
         int count = 0;
	for(int j = 0; j < Number.length; j++) {
	 if(Number[i] == Number[j]) {
	   count++;
	}
	}
	if(count == 1) {
	 Numbers[counter++] = Number[i];
	     	
} 
}
	return Numbers;	
}
public static int sumOf(int[] numbers) {
int total = 0;
for(int i = 0; i < numbers.length; i++) {
      total += numbers[i];
	
}
	return total;
}
public static void main(String[] args){
int[] input = {1,2,3,2,5,6};
int[] john =ArrangeArray(input);
System.out.print(sumOf(john));

}	
}
		