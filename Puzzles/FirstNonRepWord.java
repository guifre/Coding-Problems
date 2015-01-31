class FirstNonRepWord {
    public static void main(String[] args) {
	System.out.println(getFirst(args[0]));
	System.out.println(getFirst2(args[0]));

    }
    //O(N^2) approach
    private static String getFirst(String in) {
	char res;
	for (int i=0; i <in.length(); i++) {
	    res = in.charAt(i);
	    boolean found = false;
	    int j = 0;
	    while (j < in.length() && found == false) {
		if(j != i && res == in.charAt(j)) {
		    found = true;
		}
		j++;
	    }
	    if (!found) {
		return String.valueOf(res);
	    }
	}
	return "";
    }
    //O(N) approach
    private static String getFirst2(String in) {
	int[] map = new int[256];
	for (int i = 0; i < in.length(); i++) {
	    map[in.charAt(i)]++;
	}
	for (int i = 0; i < in.length(); i++) {
	    if(map[in.charAt(i)]==1) {
		return String.valueOf(in.charAt(i));
	    }
	}
	return "";
    }
}