public class MultiplyTwoNumbers {
 public static int Multiply(int number1, int number2){
	int result = 0;
   for (int i = 1; i <= number1; i++){
     result = result + number2;
    }
	return result;
}
  public static void main(String[] args) {
  System.out.print(Multiply(4,5));
}
}