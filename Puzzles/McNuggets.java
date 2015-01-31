public class McNuggets {
    private static final int MAX_ITERS = 10;
    /**
     * args[0] contain the number of nuggets
     */
    public static void main(String [] args) {
	System.out.println(McNuggets.isPackable(args[0]));
    }

    private static boolean isPackable(String i) {
	    int in = Integer.valueOf(i);
	    for (int a = 0; a < McNuggets.MAX_ITERS; a++) {
		for (int b = 0; b <McNuggets.MAX_ITERS; b++) {
		    for (int c = 0; c <McNuggets.MAX_ITERS; c++) {
			if ( 6*a+9*b+c*20 == in) {
			    return true;
			}
		    }
		}
	    }
	    return false;
	}



}