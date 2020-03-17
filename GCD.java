public class GCD {

    public static void main(String[] args) {

        int a = 950;
        int b = 150;


        iterative(a, b);
    }


    // metoda iteracyjne
    public static int iterative(int a, int b) {

        // szukamy dzielników liczby a
        int[] dzielnikiLiczbyA = new int[a / 2 + 1];
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                dzielnikiLiczbyA[i] = i;
            }
        }
        
        // szukamy dzielników liczby b
        int[] dzielnikiLiczbyB = new int[b / 2 + 1];
        for (int i = 2; i <= (b / 2); i++) {
            if (b % i == 0) {
                dzielnikiLiczbyB[i] = i;
            }
        }

        // rozpoczynamy szukanie największego wspólnego dzielnika od 1 ( każda liczba dzieli się przez 1)
        int nwd = 1;
        // przechodzimy przez wszystkie dzielniki liczy a
        for (int i = 0; i < dzielnikiLiczbyA.length; i++) {
            // sprawdzamy czy przypadkowo element nie jest równy zero (nasza tablica jest słabo zrobiona i ma dużo zer w sobie)
            if (dzielnikiLiczbyA[i] != 0) {
                // przechodzimy przez wszystkie dzielniki liczby b
                for (int j = 0; j < dzielnikiLiczbyB.length; j++) {
                    // znowu sprawdzamy czy nie jest zerwem, i czy dzielnik liczby A == dzielink liczby B
                    if (dzielnikiLiczbyB[j] != 0 && dzielnikiLiczbyA[i] == dzielnikiLiczbyB[j]) {
                        
                        // jeżeli mamy 2 takie same dzielniki, sprawdzamy czy są większe od największego jaki mamy
                        if (nwd < dzielnikiLiczbyA[i]) {
                            nwd = dzielnikiLiczbyA[i];
                        }
                    }
                }
            }
        }

        System.out.println("Największy wspólny dzielnik " + a + " i " + b + " to " + nwd);
        return nwd;
    }

    // rekurencyjny algorytm euklidesa
    public static int recursive(int a, int b) {
        // jeżeli nasza liczba b == 0, to znaczy że doszliśmy do końca rekurencji i możemy zwrócić a, czyli nasz największy dzielnik
        if (b == 0) {
            return a;
        }
        // wywołujemy rekurencję zamieniając elementy miejscami i dzieląc a modulo b
        return recursive(b, a % b);
    }
}
