class Rep {

	public static void main(String[] args) {
		System.out.println(Rep.replace(args[0]));
	}	
	private static String replace(String in) {
		for (int i=0; i<in.length(); i++) {
			if (in.charAt(i) == ' ' && i > 0) {
				in = in.substring(0, i).concat("%20").concat(in.substring(i+1, in.length()));
			}
		}
return in;
	}	
	


}
