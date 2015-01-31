class RevString {


    public static void main(String[] args) {
	System.out.println(args[0]);
	System.out.println(reverse(args[0]));
	printReverse(args[0]);
    }

    public static String reverse(String in) {
        if (in.length() == 1) {
	    return in;
	} else {
	    return in.substring(in.length()-1, in.length()).concat(reverse(in.substring(0, in.length()-1)));
	}
    }

	private static void printReverse(String in) {
		if (in.length() > 0) {
			printReverse(in.substring(1));
			System.out.print(in.substring(0,1));
		}
	}
}
