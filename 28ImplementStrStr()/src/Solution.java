
public class Solution {
	public static void main(String[] args) {
//		String haystack = "hello";
//		String needle = "ll";
		String haystack = "aaaaa";
		String needle = "bba";
		int result = strStr(haystack, needle);
		System.out.println(result);
		System.out.println("Hello World");
	}
    public static int strStr(String haystack, String needle) {
        int i,j;
        for(i = 0; ; i++) {
        	for(j = 0; ; j++) {
        		if (j == needle.length()) return i;
        		if (i + j == haystack.length()) return -1;
        		// when increase index and compare, only increase j, and easy to get i.
        		if(needle.charAt(j) != haystack.charAt(i+j)) {
        			break;
        		}
        	}
        }
    }
}
