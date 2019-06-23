package ch11pc01;
import java.util.Scanner;

/**
 *
 * @author Frank
 * date 11/28/2017
 */
public class Ch11pc01 {

    public static void main(String[] args) {
        // variables
        int[] scores;
        int numberOfTests;
        
        //instantiate Scanner class keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //request user to input scores
        System.out.print("Please enter the number of tests. ");
        numberOfTests = keyboard.nextInt();
        
        //allocate memory for the array
        scores = new int[numberOfTests];
        
        
        
        //request scores from user
        for (int i = 0; i < numberOfTests; i++) {
            System.out.print("Please enter the score for test #" + (i + 1) + ". ");
            scores[i] = keyboard.nextInt();
        }
        
        //instantiate the TestScores class
        TestScores testScores = new TestScores(scores);
        
        //display the average for the scores
        try {
            System.out.println("The average of the test scores is: " + testScores.getAverage() + ".");
        }
        catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        
    }
    
}
