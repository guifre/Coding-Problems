class LongestPalindrome {

    public static void main(String[] args) {
	System.out.println(longestPalindromeSimple(args[0]));
    }
    private static String expandAroundCenter(String s, int c1, int c2) {
	int l = c1, r = c2;
	int n = s.length();
	while (l >= 0 && r <= n-1 && s.charAt(l) == s.charAt(r)) {
	    l--;
	    r++;
	}
	//System.out.println(l+" "+r);
	return s.substring(l+1, r);
    }

    private static String longestPalindromeSimple(String s) {
	int n = s.length();
	if (n == 0) return "";
	String longest = s.substring(0, 1);  // a single char itself is a palindrome
	for (int i = 0; i < n-1; i++) {
	    String p1 = expandAroundCenter(s, i, i);
	    if (p1.length() > longest.length())
		longest = p1;

	    String p2 = expandAroundCenter(s, i, i+1);
	    if (p2.length() > longest.length())
		longest = p2;
	}
	return longest;
    }







}