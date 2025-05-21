public class NumberDivisor { 
public static int[] divisor(int[] numbers, int divisor) {
    int count = 0;

    for (int num : numbers) {
        if (num % divisor == 0) {
            count++;
        }
    }

    int[] result = new int[count];
    int index = 0;

    for (int num : numbers) {
        if (num % divisor == 0) {
            result[index++] = num;
        }
    }

    return result;
}
}
