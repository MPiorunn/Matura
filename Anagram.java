public class Anagram {

    public static void main(String[] args) {

        String a = "dnoces";
        String b = "second";
        System.out.println(isAnagram(a, b));

        String c = "dnoswces";
        String d = "secognnd";
        System.out.println(isAnagram(c, b));
    }

    private static boolean isAnagram(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        if (aChars.length != bChars.length) {
            return false;
        }
        for (int i = 0; i < aChars.length; i++) {
            for (int j = 0; j < bChars.length; j++) {
                if (aChars[i] == bChars[j] && aChars[i] != 0 && bChars[j] != 0) {
                    bChars[j] = 0;
                    break;
                }
            }
        }
        for (int i = 0; i < bChars.length; i++) {
            if (bChars[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
