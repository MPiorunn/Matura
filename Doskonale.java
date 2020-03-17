public class Doskonale {

    // liczba doskonała, to taka, którą jeżeli rozdzielimy na dzielniki, ich suma daje tę właśnie liczbę
    // np . 6 = 3 + 2 + 1
    public static void main(String[] args) {
        // przykładowa liczba doskonała
        int number = 33550336;

        // zaczynamy zliczanie sumy dzielników, każda liczba dzieli się przez 1, dlatego można tu ustawić 1 na start
        int sum = 1;
        // przechodzimy przez liczbę do połowy, bo największym dzielnikiem liczby będzie jej połowa (w przypadku liczb parzystych)
        // w przypadku liczb nieparzystych jest to jeszcze mniejsza
        for (int i = 2; i <= (number / 2); i++) {
            // jeżeli nasza liczba jest podzielna bez reszty przez jakąś liczbę, to ta liczba jest jej dzielnikiem
            if (number % i == 0) {
                // zwiększamy sumę o znaleziony dzielnik
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
