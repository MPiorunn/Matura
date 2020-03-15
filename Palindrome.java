public class Palindrome {

    public static void main(String[] args) {


        String kajak = "kobyła ma mały bok";

        char[] original = kajak.toCharArray();

        char[] withoutSpaces = removeSpaces(original);

        char[] reverseWord = reverseWord(withoutSpaces);


    }

    public static char[] removeSpaces(char[] original) {
        int spaceCounter = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] == ' ') {
                spaceCounter++;
            }
        }


        int newLength = original.length - spaceCounter;
        char[] withoutSpaces = new char[newLength];
        int counter = 0;

        for (int i = 0; i < original.length; i++) {
            if (original[i] != ' ') {
                withoutSpaces[counter] = original[i];
                counter++;
            }
        }
        return withoutSpaces;
    }

    public static char[] reverseWord(char[] chars) {
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - i - 1];
        }
        return reversed;
    }


    public static boolean isPalindrome(String string) {
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }

        return true;
    }
}
