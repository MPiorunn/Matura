public class MinMax {

    
    // Jednoczesne szukanie maksymalnej i minimalnej wartości w tablicy
    public static void main(String[] args) {


        // jeżeli szukamy najmniejszego elementu, musimy zacząć od maksymalnego
        int min = Integer.MAX_VALUE;
        // jeżeli szukamy największego elementu, musimy zaczać od najmniejszego
        int max = Integer.MIN_VALUE;


        // tablica w której szukamy skrajnych wartości
        int[] numbers = new int[]{3, 234, -1, 2, 24, 4};

        // przechodzimy przez całą tablicę
        for (int i = 0; i < numbers.length; i++) {
            // jeżeli dany element tablicy jest większy niż nasz aktualnie maksymalny, to nasz maksymalny zostaje zastąpiony tym elementem
            if (numbers[i] > max) {
                max = numbers[i];
            }
            
            // tak samo jest w przypadku gdy jest mniejszy
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

    }
}
