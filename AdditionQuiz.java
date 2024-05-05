import java.util.Scanner;
import java.util.Random;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        // Number of questions
        int numQuestions = 5;
        int[] questions = new int[numQuestions];
        int[] answers = new int[numQuestions];
        
        // Generate questions and answers
        for (int i = 0; i < numQuestions; i++) {
            int num1 = rand.nextInt(10) + 1; // Generate a random number between 1 and 10
            int num2 = rand.nextInt(10) + 1;
            questions[i] = num1 + num2; // Store the correct answer
            System.out.print("Question " + (i+1) + ": " + num1 + " + " + num2 + " = ");
            answers[i] = scanner.nextInt(); // Store user's answer
        }
        
        // Calculate score
        int score = 0;
        for (int i = 0; i < numQuestions; i++) {
            if (answers[i] == questions[i]) {
                score++;
            }
        }
        
        // Display result
        System.out.println("\nResult:");
        System.out.println("You scored " + score + " out of " + numQuestions);
    }
}
