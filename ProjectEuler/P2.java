/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */


public class P2 {

    int MAX_VALUE = 4000000;

    public int sol(int i, int j, int count) {

        if (j >=MAX_VALUE ) {
            return count;
        } else if (j % 2 == 0) {
            count += j;
        }
        return sol(j, i + j, count);
    }

    public static void main(String[] args) {
	P2 obj = new P2();
        System.out.println(obj.sol(1, 2, 0));
    }

}