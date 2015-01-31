/*
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */


public class P1 {

    int MAX_VALUE = 999;

    public int sol() {
  	//Find the sum of all the multiples of 3 or 5 below 1000.
        int count = 0;
        for (int i = MAX_VALUE; i > 0; i--) {
            if (i % 3 == 0 || i % 5 == 0) {
                count += i;
            }
        }
        return count;
    }

 public static void main(String[] args) {
	P1 obj = new P1();
        System.out.println("P1: " + obj.sol());

    }
}
