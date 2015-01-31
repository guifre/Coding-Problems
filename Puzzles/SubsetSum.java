class SubsetSum {
    public static void main(String[] args) {
	int[] in = {1, 3, 4, 2, 4, 5, 1, 2, 3, 5};
	getSubSet(in, 5, 0, 0, "");
    }
    private static void getSubSet(int[] in, int target, int start, int cRes, String cPrint) {
	if (start < in.length) {
	    for (int i = start; i <in.length; i++) {
		if (in[i]+cRes == target) {
		    System.out.println(cPrint+", "+in[i]);
		} else if(in[i]+cRes < target) {
		    getSubSet(in, target, start+1, cRes+in[i], cPrint+", "+in[i]);
		}
		    
	    }

	}

    }

}