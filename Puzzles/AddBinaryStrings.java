class AddBinaryStrings {

    public static void main(String[] args) {
	System.out.println(add(args[0], args[1], 0));
    }
    private static String add(String in1, String in2, int carry) {
	if (in1.length() == 0 || in2.length() == 0) {
	    String res="";
	    while (carry> 0){
		res = Integer.toString(carry%2).concat(res);
		carry = carry /2;
	    }
	   return res;
	} else {
	    int res = Integer.valueOf(in2.substring(in2.length()-1, in2.length())) + Integer.valueOf(in1.substring(in1.length()-1, in1.length())) + carry;
	    int digit = res % 2;
	    carry = res / 2;
	    return add(in1.substring(0, in1.length()-1), in2.substring(0, in2.length()-1), carry).concat(Integer.toString(digit));
	}
    }
}