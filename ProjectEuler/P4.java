/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class P4 {

    int MAX_VALUE = 999;

    public int sol() {
        int best = 0;
        for (int i = MAX_VALUE; i > 99; i--) {
            for (int j = MAX_VALUE; j > 99; j--) {
                String reverse = new StringBuffer(a.substring(a.length() / 2)).reverse().toString();
                if (reverse.equals(a.substring(0, a.length() / 2)) && Integer.parseInt(a) > best) {
                    best = Integer.parseInt(a);
                }
            }
        }
        return best;
    }

 public static void main(String[] args) {
	P4 obj = new P4();
        System.out.println("P4: " + obj.sol());

    }
}
