package ch11pc01;

/**
 *
 * @author Frank
 */
public class TestScores {
    //fields
    private int[] scores;
    
    //constructors
    public TestScores(int[] scores) {
        this.scores = new int[scores.length];
        System.arraycopy(scores, 0, this.scores, 0, scores.length);
    }
    
    //methods
    //accessors
    /**
     * This method will return the value of the array of int scores
     * @return int array of scores
     */
    public int[] getScores() {
        return scores;
    }
    
    //mutators
    
    
    
    public double getAverage() {
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0 && scores[i] <= 100) {
                sum += scores[i];
            }
            else {
                throw new IllegalArgumentException("Invalid score for test " + (i + 1) + ".");
            }
        }
        return sum / scores.length;
    }
}
