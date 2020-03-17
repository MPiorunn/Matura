public class Anagram {

    
    // ANAGRAM - dwa słowa złożone z tych samych liter, w różnej kolejności
    public static void main(String[] args) {

        // sprawdzenie czy te dwa słowa są anagramami 
        String a = "dnoces";
        String b = "second";
        System.out.println(isAnagram(a, b));

        String c = "dnoswces";
        String d = "secognnd";
        System.out.println(isAnagram(c, b));
    }

    private static boolean isAnagram(String a, String b) {
        // zmiana typu danych ze String na tablicę charów
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        // jezeli mamy słowa o różnej długości, nie ma sensu sprawdzać dalej
        if (aChars.length != bChars.length) {
            return false;
        }
        
        // przechodzimy przez pierwszą tablicę (słowo a)
        for (int i = 0; i < aChars.length; i++) {
            // przechodzimy przez każdy znak z drugiej tablicy (słowo b)
            for (int j = 0; j < bChars.length; j++) {
                // sprawdzamy czy znaleźliśmy takie same litery i czy nie są zerem
                if (aChars[i] == bChars[j] && aChars[i] != 0 && bChars[j] != 0) {
                    // jeżeli znajdziemy dwie takie same litery, to w tablicy b, zastępujemy ją zerem
                    // jeżeli słowa są anagramami, wszystkie litery w tablicy b, po przejściu algorytmu będą zerami
                    bChars[j] = 0;
                    break;
                }
            }
        }
        
        // sprawdzamy czy któraś z liter w tablicy b nie jest zerem, jeżeli wszystkie są zerami, to mamy anagram
        for (int i = 0; i < bChars.length; i++) {
            if (bChars[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
