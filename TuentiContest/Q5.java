public final class Q5 {

	private int solve(int tCows, int tWei, String[] wei,
			String[] prod, int iter, int aProd, int aWei) {

		//checks if there are cows left to process
		if (iter < tCows) {

			//makes sure not to exceed the weight restrictions imposed
			if (aWei + Integer.parseInt(wei[iter]) <= tWei) {

				//returns the higher production between taking or not the current cow
				return Math.max(Math.max(
						solve(tCows, tWei, wei, prod, iter + 1, aProd
								+ Integer.parseInt(prod[iter]),
								aWei + Integer.parseInt(wei[iter])), aProd),
						Math.max(
								solve(tCows, tWei, wei, prod, iter + 1,
										aProd, aWei), aProd));
			} else {
				//do not take the current cow as it does not fit
				return solve(tCows, tWei, wei, prod, iter + 1, aProd,
						aWei);
			}
		}
		return aProd;
	}

	public static void main(String args[]) {

		//parses the input
		int tCows = Integer.parseInt(args[0]);
		int tWeight = Integer.parseInt(args[1]);
		String[] wei = args[2].split(",");
		String[] prod = args[3].split(",");

		//creates an instance of the class
		Q5 obj = new Q5();

		//prints the solution given the the MaxProduction method
		System.out.println(obj.solve(tCows, tWeight, wei, prod, 0, 0, 0));
	}
}
