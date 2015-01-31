class MinorDiff {
    public static void main(String[] args) {
	int[] in = {1, 2, 3, 4, 5, 6, 7, 10, 12, 14};
	System.out.println(getMinDiff(in, 6, 0, 0, in.length-1));
    }
    private static int getMinDiff(int[] in, int target, int up, int mid, int low) {
	mid = low + (up-low)/2;
	if (in[mid] > target) {
	    return getMinDiff(in, target, up-1, mid, low);
	} else if (in[mid] < target) {
	    return getMinDiff(in, target, up, mid, low+1);
	} else {
	    return target;
	}
    }
}