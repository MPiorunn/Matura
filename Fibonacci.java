public class Fibonacci {

    public static void main(String[] args) {

        int numbers = 13;

        System.out.println(iterative(numbers));

    }

    // iteracyjna metoda znalezienia n elementów
    private static int[] iterative(int numbers) {
        
        // nowa tabalica intów o rozmiarze n
        int[] series = new int[numbers];
        for (int i = 0; i < numbers; i++) {

            // zerowy element jest zawsze zero
            if (i == 0) {
                series[i] = 0;
            } 
            // pierwszy element jest zawsze 1
            else if (i == 1) {
                series[i] = 1;
            } 
            // każdy kolejny element jest sumą dwóch poprzednich
            else {
                series[i] = series[i - 1] + series[i - 2];
            }

        }
        return series;
    }

    // metoda rekurencyjna do odnalezienia n-tego elementu ciągu fibonacciego
    public static int recursive(int n) {
        // jeżeli szukamy wartości elementu zerowego lub pierwszego, możemy po prostu zwrócić n, które jest równe 0 lub 1
        // to jest bardzo ważne miejsce w którym zatrzymujemy rekurencję żeby nie trwała w nieskończoność
        if (n <= 1) {
            return n;
        }
        // jeżeli szukamy innego elementu, musimy rekurencyjnie wywołać sumę dwóch poprzednich elementów
        return recursive(n - 1) + recursive(n - 2);
    }

}
