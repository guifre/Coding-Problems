public final class Main {

	public static void main(String args[]) {

		// we parse the input
		int tCows = Integer.parseInt(args[0]);
		int tWeight = Integer.parseInt(args[1]);
		String[] wei = args[2].split(",");
		String[] prod = args[3].split(",");

		// we print the solution given the the MaxProduction method
		System.out.println(MaxProduction(tCows, tWeight, wei, prod, 0, 0, 0));
	}

	private static int MaxProduction(int tCows, int tWei, String[] wei,
			String[] prod, int iter, int aProd, int aWei) {

		// we check if there are cows left to process
		if (iter < tCows) {

			// we make sure not to exceed the weight restrictions imposed
			if (aWei + Integer.parseInt(wei[iter]) <= tWei) {

				// we return the higher production between taking or not the current cow
				return Math.max(Math.max(
						MaxProduction(tCows, tWei, wei, prod, iter + 1, aProd
								+ Integer.parseInt(prod[iter]),
								aWei + Integer.parseInt(wei[iter])), aProd),
						Math.max(
								MaxProduction(tCows, tWei, wei, prod, iter + 1,
										aProd, aWei), aProd));
			} else {
				// we do not take the current cow as it does not fit
				return MaxProduction(tCows, tWei, wei, prod, iter + 1, aProd,
						aWei);
			}
		}
		return aProd;
	}

}