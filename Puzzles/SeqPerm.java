class SeqPerm {
    /*
     * The set [1,2,3,,n] contains a total of n! unique permutations.
     * By listing and labeling all of the permutations in order,
     * We get the following sequence (ie, for n = 3):
     * "123"
     * "132"
     * "213"
     * "231"
     * "312"
     * "321"
     * Given n and k, return the kth permutation sequence.
     * Note: Given n will be between 1 and 9 inclusive.
     */
    public static void main(String[] args) {
	permute(args[0],  "");

    }
    private static void permute(String in, String prefix) {
	int N = in.length();
	if (N==0) {
	    System.out.println(prefix);
	} else {
	    for (int i = 0; i < N; i++) {
		permute(in.substring(0,i)+in.substring(i+1, N), prefix+in.charAt(i));
	    }

	}

    }


}