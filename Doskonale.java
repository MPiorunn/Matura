public class Doskonale {

    public static void main(String[] args) {
        int number = 33550336;

        int sum = 1;
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (number == sum) {
            System.out.println("Jest to liczba doskonala");
        } else {
            System.out.println("Nie jest");
        }
    }
}
