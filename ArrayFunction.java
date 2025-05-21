import java.util.Scanner;
public class ArrayFunction {
 public static int[] MinAndMax(int[] numbers) {
  int total = 0;
Scanner input = new Scanner(System.in);
System.out.print("kindly enter a number to specify the length of the Array");
int number = input.nextInt();
numbers = new int[number];
for(int i = 0; i < numbers.length; i++){
	total += numbers[i];
}
	return new int[number] total;
}
}
         
	