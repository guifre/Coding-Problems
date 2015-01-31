class CombinationParantheses {

    /* input is the number to combine
       i.e. 3 (()()), ()())), (())()
*/
    public static void main(String[] args) {
	combine(Integer.valueOf(args[0]), 0, 0, "");

    }
    private static void combine(int total, int left, int right, String out) {
	if (left == total && right == total) {
	    System.out.println(out);
	} else {
	    if (left < total) {
		combine(total, left + 1, right, out + "(");
	    }
	    if (right < left && right < total) {
		combine(total, left, right + 1, out + ")");
	    }	    
	}
    }
}