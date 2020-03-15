public class Prime {

    public static void main(String[] args) {

        int a = 7;
        System.out.println(isPrime(a));
    }

    private static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
