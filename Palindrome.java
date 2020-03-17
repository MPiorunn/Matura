public class Palindrome {

    public static void main(String[] args) {


        String kajak = "kobyła ma mały bok";

        // dłuższy sposób działający jeżeli są spacje w tekście
        // tworzymy tablicę charów z tekstu
        char[] original = kajak.toCharArray();

        // tworzymy nową tablicę bez spacji
        char[] withoutSpaces = removeSpaces(original);

        // obracamy słowo żeby na końcu je porównać
        char[] reverseWord = reverseWord(withoutSpaces);
        
        // tutaj tylko trzeba dorobić porównanie 2 tablic

    }

   
    // metoda usuwająca spacje z tablicy charów
    public static char[] removeSpaces(char[] original) {
        // licznik ile spacji znaleźliśmy
        
        int spaceCounter = 0;
        for (int i = 0; i < original.length; i++) {
            // jeżeli znak jest spacją, to zwiększamy licznik
            if (original[i] == ' ') {
                spaceCounter++;
            }
        }

        // długość tablicy bez spacji
        int newLength = original.length - spaceCounter;
        // nowa tablica bez spacji
        char[] withoutSpaces = new char[newLength];
        // licznik ile elementów włożyliśmy do tablicy bez spacji
        int counter = 0;

        for (int i = 0; i < original.length; i++) {
            // jeżeli znak nie jest równy spacji, możemy go włożyć do nowej tablicy i zwiększyć licznik
            if (original[i] != ' ') {
                withoutSpaces[counter] = original[i];
                counter++;
            }
        }
        return withoutSpaces;
    }

    // metoda do obracania tablicy charów
    public static char[] reverseWord(char[] chars) {
        // nowa tablica o takiej samej długości jak wejściowa
        char[] reversed = new char[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            // każdemu elementowi nowej tablicy przypisujemy kolejny od tyłu element wejściowej
            reversed[i] = chars[chars.length - i - 1];
        }
        return reversed;
    }


    / prostszy sposób, przechodzimy przez tablicę od poczatku i od końca jednocześnie i sprawdzamy czy znaki są równe. NIE DZIAŁA ZE SPACJAMI!
    public static boolean isPalindrome(String string) {
        // tworzymy tablice charów z naszego Stringa
        char[] chars = string.toCharArray();

        // przechodzimy przez tylko połowę zakresu tablicy, bo jednocześnie sprawdzamy elementy od tyłu
        for (int i = 0; i < chars.length / 2; i++) {
            // chars[i] - kolejny element z przodu
            // chars[chars.length - i - 1] - kolejny element z tylu, -1 jest konieczne żeby nie odwołać się do indeksu poza zakresem tablicy
            
            // jeżeli znaki nie są sobie równe, to nie mamy palindromu
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }

        return true;
    }
}
