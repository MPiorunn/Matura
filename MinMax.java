public class MinMax {

    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        int[] numbers = new int[]{3, 234, -1, 2, 24, 4};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

    }
}
