import java.util.Arrays;
public class PhaseOpe4 {
 public static int john(int[] number) {
	int count = 0;
	int counter = 0;
	for (int i = 0; i < number.length; i++) {
		count = 0;
	     for(int j = 0; j < number.length; j++) {
	         if (number[i] % number[j] == 0) {
		  count++;
		}
		
		}
	if(count == 1) {
		counter++;
		
} 
}
	return Number;	
}
public static void main(String[] args){
int[] input = {1,2, 2,3,4,4,5,6,6,7};
System.out.print(john(input));

}	
}
		