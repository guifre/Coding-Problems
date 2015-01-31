/*
 * http://contest.tuenti.net/Question_3.html
 */

public class Q3 {

	public boolean isPrime(int num) {

		boolean prime = true;
		int div = num - 1;
		while ((div != 1) && (prime == true)) {
			if (num % div == 0) {
				prime = false;
			}
			div--;
		}
		return prime;
	}

	public int reverse(int num) {

		int lastDigit; // the last digit returned when reversed
		int reverse = 0;
		do {
			lastDigit = num % 10;
			reverse = (reverse * 10) + lastDigit;
			num = num / 10;
		} while (num > 0);

		return reverse;
	}

	public static void main(String[] argv) {
		int sum = 0;
		int target = Integer.parseInt(argv[0]);
		int i;
		Q3 obj = new Q3();

		for (i = 2; i < target; i++) {

			if (obj.isPrime(i)) {
				int ir = obj.reverse(i);
				if ((obj.isPrime(ir)) && (ir != i)) {
					sum += i;
				}
			}
		}
		System.out.println(sum);
	}
}
