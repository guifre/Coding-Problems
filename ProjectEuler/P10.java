/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class P10 {

    int MAX_VALUE = 200000;

    public int sol() {
        int sum = 0;
        int div = 2;
        for (int temp = 2; temp < MAX_VALUE; temp++) {
            while (temp % div != 0 && div < temp ) {
                div++;
            }
            if (div == temp) {
                sum += temp;
            }
            div=2;
        }
        return sum;
    }

 public static void main(String[] args) {
	P10 obj = new P10();
        System.out.println("P10: " + obj.sol());
    }
}
