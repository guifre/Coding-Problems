/*
 * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class P9 {

    public int sol() {
        int i = 0, j = 0, k = 0;
        for (int l = 1; l < 1000; l++) {
            for (int m = 1; m < 1000; m++) {
                for (int n = 1; n < 1000; n++) {
                    if (((l * l + m * m) == (n * n)) && ((m + n + l) == (1000))) {
                        i = l;
                        j = m;
                        k = n;
                    }
                }
            }
        }
        return i*j*k;
    }

 public static void main(String[] args) {
	P9 obj = new P9();
        System.out.println("P9: " + obj.sol());

    }
}
