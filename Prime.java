public class Prime {

    public static void main(String[] args) {

        int a = 7;
        System.out.println(isPrime(a));
    }

    private static boolean isPrime(int a) {
        // patrzymy czy liczba jest pierwsza poprzez przejście przez wszystkie liczby od 2 (1 nie jest l.p.) do jej połowy jej i sprawdzenie czy jest jej dzielnikiem
        for (int i = 2; i < a/2; i++) {
            // jeżeli liczba jest podzielna przez drugą bez reszty, to ta druga jest jej dzielnikiem, czyli liczba nie jest pierwsza
            if (a % i == 0) {
                return false;
            }
        }
        // jeżeli przeszlismy przez wszystkie liczby i żadna nie była dzielnikiem naszej liczby, zwracamy true, bo liczba jest pierwsza
        return true;
    }
}
