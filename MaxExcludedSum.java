public class MaxExcludedSum {
    public static int[] maxExcludedSum(int[] number) {
        int totalSum = 0;
        for (int num : number) {
            totalSum += num;
        }

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            int currentSum = totalSum - number[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
	    if (currentSum < minSum) {
                minSum = currentSum;
            }

        }

        return new int[]{maxSum, minSum};
    }

    public static void main(String[] args) {
        int[] input = {8,5,4,3};
        int[] result = maxExcludedSum(input);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
