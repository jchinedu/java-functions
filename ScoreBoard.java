import java.util.Arrays;

public class ScoreBoard {
     public static int[] totalElementInAnArray(int[][] numbers) {
        int[] totals = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            totals[i] = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                totals[i] += numbers[i][j];
            }
        }
        return totals;
    }

        public static double[] calculateAverage(int[][] numbers) {
        double[] averages = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
            averages[i] = (double) sum / numbers[i].length;
        }
        return averages;
    }

       public static int[] checkPosition(int[] totals) {
        int[] ranks = new int[totals.length];
        for (int i = 0; i < totals.length; i++) {
            int rank = 1;
            for (int j = 0; j < totals.length; j++) {
                if (totals[j] > totals[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }

        public static void main(String[] args) {
        int[][] scores = {
            {3, 3, 4},  
            {9, 1, 3}   
        };

        int[] totals = totalElementInAnArray(scores);
        System.out.println("Total Scores: " + Arrays.toString(totals));

        double[] averages = calculateAverage(scores);
        System.out.println("Average Scores: " + Arrays.toString(averages));

        int[] ranks = checkPosition(totals);
        System.out.println("Student Ranks: " + Arrays.toString(ranks));
    }
}
