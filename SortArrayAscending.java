public class SortArrayAscending {

    public static int[] sortAscending(int[] arr) {
        int n = arr.length;'
        for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

       
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 5, 1, 3};
        int[] sorted = sortAscending(input);

        System.out.print("Sorted array: [");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i]);
            if (i < sorted.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
