/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class P5 {

    int MAX_VALUE = 20;

    public int sol() {
        int j = MAX_VALUE + 1;
        int c = 1;
        while (c < MAX_VALUE) {
            c = 1;
            j++;
            while (j % c == 0) {
                c++;
            }
        }
        return j;
    }

 public static void main(String[] args) {
	P5 obj = new P5();
        System.out.println("P5: " + obj.sol());
    }
}
