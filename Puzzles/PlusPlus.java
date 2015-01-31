class PlusPlus {

    public static void main(String[] args) {
	int[] in = {9, 9, 9, 9};
	
	for (Integer i : in) {
	    System.out.print(i+", ");
	}
	System.out.println();
        int[] out = plusplus(in);

	for (Integer i : out) {
            System.out.print(i+", ");
        }
	int[] in3 = {9, 9, 1, 9};
	
        for (Integer i : in3) {
            System.out.print(i+", ");
        }
        System.out.println();
        out = plusplus(in3);

        for (Integer i : out) {
            System.out.print(i+", ");
        }

    }

    private static int[] plusplus(int[] in2) {
	int[] in = in2;
	int i = in.length-1;
	int res = (in[i]+1);
	int carry= res/10;;
	in[i] = res%10;
	i--;
        while (carry > 0 && i >= 0) {
	    res = (in[i]+carry);
	    carry = res/10;
            in[i] = res%10;
	    i--;
	}
	return in;    
    }
}