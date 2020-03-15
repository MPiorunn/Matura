public class GCD {

    public static void main(String[] args) {

        int a = 950;
        int b = 150;


        iterative(a, b);
    }


    public static int iterative(int a, int b) {

        // find a divisors
        int[] dzielnikiLiczbyA = new int[a / 2 + 1];
        for (int i = 2; i <= (a / 2); i++) {
            if (a % i == 0) {
                dzielnikiLiczbyA[i] = i;
            }
        }

        // find b divisors
        int[] dzielnikiLiczbyB = new int[b / 2 + 1];
        for (int i = 2; i <= (b / 2); i++) {
            if (b % i == 0) {
                dzielnikiLiczbyB[i] = i;
            }
        }

        System.out.println("Dzielniki liczby A");
        for (int i = 0; i < dzielnikiLiczbyA.length; i++) {
            if (dzielnikiLiczbyA[i] != 0) {
                System.out.println(dzielnikiLiczbyA[i]);
            }
        }

        System.out.println("Dzielniki liczby B");
        for (int i = 0; i < dzielnikiLiczbyB.length; i++) {
            if (dzielnikiLiczbyB[i] != 0) {
                System.out.println(dzielnikiLiczbyB[i]);
            }
        }

        int nwd = 1;
        for (int i = 0; i < dzielnikiLiczbyA.length; i++) {
            if (dzielnikiLiczbyA[i] != 0) {
                for (int j = 0; j < dzielnikiLiczbyB.length; j++) {
                    if (dzielnikiLiczbyB[j] != 0 && dzielnikiLiczbyA[i] == dzielnikiLiczbyB[j]) {
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

    public static int recursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return recursive(b, a % b);
    }
}
