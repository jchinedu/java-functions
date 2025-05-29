public static int factorsOf(int number) {
        int count = 0;

        if (number <= 0) {
            return 0;   }
	for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }
