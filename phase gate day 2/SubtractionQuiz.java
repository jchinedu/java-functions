import java.util.Scanner;
import java.util.Random;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int totalQuestions = 10;
        int score = 0;

        System.out.println("Subtraction Quiz: You have " + totalQuestions + " questions!");

        for (int i = 1; i <= totalQuestions; i++) {
            int num1 = rand.nextInt(21);
            int num2 = rand.nextInt(21);

            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            int correctAnswer = max - min;

            System.out.print("Question " + i + ": What is " + max + " - " + min + "? ");
            int userAnswer = input.nextInt();
	    if (userAnswer != correctAnswer) {
                System.out.println("you have one more chance");
		System.out.print("Question " + i + ": What is " + max + " - " + min + "? ");
             userAnswer = input.nextInt();
		}


            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("\nYour final score: " + score + " out of " + totalQuestions);
    }
}
