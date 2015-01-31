public final class Spiral {
	public static void main(String args[]) {
		int length = Integer.parseInt(args[0]);
		int[][] M = new int[length][length];

		int count = 0;
		for (int i = 0; i < length / 2; i++) {

			// up line
			for (int j = i; j < length - i - 1; j++) {
				M[i][j] = count;
				count++;
			}
			// right line
			for (int j = i; j < length - 1 - i; j++) {
				M[j][length - i - 1] = count;
				count++;
			}
			// bottom line
			for (int j = i; j < length - 1 - i; j++) {
				M[length - 1 - i][length - 1 - j] = count;
				count++;
			}
			// left line
			for (int j = i; j < length - 1 - i; j++) {
				M[length - j - 1][i] = count;
				count++;

				/*
				 * If the number of rows and columns is odd this part fills the
				 * last value of the matrix
				 */
				if ((length % 2 != 0) && (i == (length / 2 - 1))
						&& (j == length - 2 - i)) {
					M[length - j - 1][i + 1] = count;
				}
			}

		}

		// if the length is even we added one more to count, here we fix it
		if (length % 2 == 0)
			count--;

		// we print the final matrix, the deeper for is to pad zeros on the left
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				for (int k = Integer.toString(M[i][j]).length(); k < Integer
						.toString(count).length(); k++) {
					System.out.print("0");
				}
				System.out.format("%d ", M[i][j]);
			}
			System.out.print("\n");
		}
	}
}
