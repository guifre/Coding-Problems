class Permute {

    public static void main(String[] args) {
	permute("", args[0]);
    }
    private static void permute(String prefix, String in) {
	int N = in.length();
	if (N == 0) {
	    System.out.println(prefix);
	} else {
	    for (int i = 0; i < N; i++ ) {
		permute (prefix + in.charAt(i), in.substring(0,i) + in.substring(i + 1, N));
	    }
	}
    }
}