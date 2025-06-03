import java.util.Scanner;
public class Reverse {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("enter a sentence ");
	String word = input.nextLine();
	String ch = input.next(); 
	String newWord ="";
	for(int i = word.length()-1; i >= 0; i--) {	
	char john = Character.toLowerCase(word.charAt(i));
	newWord += word.charAt(i);
          }
	System.out.println(newWord);
}
  }

	
	