public class Fibonacci {

    public static void main(String[] args) {

        int numbers = 13;

        System.out.println(iterative(numbers));

    }

    private static int[] iterative(int numbers) {
        int[] series = new int[numbers];
        for (int i = 0; i < numbers; i++) {

            if (i == 0) {
                series[i] = 0;
            } else if (i == 1) {
                series[i] = 1;
            } else {
                series[i] = series[i - 1] + series[i - 2];
            }

        }
        return series;
    }

    public static int recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 1) + recursive(n - 2);
    }

}
