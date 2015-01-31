
class CombinePrint {
    public static void main(String[] args) {
	print("", args[0]);
    }
    private static void print(String prefix, String in) {
	 System.out.print("{" + prefix + "}, ");
	for (int i =0; i <in.length();i++) {
	    print(prefix+in.charAt(i), in.substring(0,i).concat(in.substring(i+1, in.length())));
	}
	//System.out.print("{" + prefix + "}, ");

    }

}