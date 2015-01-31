class UnixPath {

    /*
     * Given an absolute path for a file (Unix-style), simplify it.
     * For example,
     * path = "/home/", => "/home"
     * path = "/a/./b/../../c/", => "/c"
     * Corner Cases:
     * Did you consider the case where path = "/../"?
     * In this case, you should return "/".
     * Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
     * In this case, you should ignore redundant slashes and return "/home/foo".
     */

    public static void main(String[] args) {
	System.out.println(getAbsolutePath(args[0]));
    }
    private static String getAbsolutePath(String in) {
	if (in == null) {
	    return "";
	}
	String tmp = in.replaceAll("/./", "/");
	tmp = tmp.replaceAll("//", "/");
	for(int i = tmp.length()-1; i >=3; i--) {
	    if (tmp.substring(i-3, i).equals("/..")) {
		int j = i;
		i = i-3;
		while(tmp.charAt(i) != '/'){
		    i--;
		}
		tmp = tmp.substring(0, i)+tmp.substring(j, tmp.length());
	    }
	}
	if (tmp.endsWith("/")) {
	    return tmp.substring(0, tmp.length()-1);
	} else {
	    return tmp;
	}
    }

}