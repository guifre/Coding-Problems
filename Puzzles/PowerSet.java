public class PowerSet {
    //I assume args[0] something like "135225235"
    public static void main(String[] args) {
		print(args[0]);
    }

    public static void print(String a) {
	char[] in = a.toCharArray();
	//number of items for each iteration
	for (int i = 1; i < in.length; i++) {
	    int tmp = i;
            for (int j = 0 ; j < in.length; j++) {
		System.out.print(in[j]);
		tmp--;
		if (tmp == 0) {
		    tmp = i;
		    System.out.print("}, {");
		}
		//System.out.print(j);
		//number of times we have to print elements
		int k = j / i;
		//System.out.print(in[k]);
		    //		    System.out.println("i "+i + " j "+j);
		    //		System.out.print("},");
	    }
	}
    }
}