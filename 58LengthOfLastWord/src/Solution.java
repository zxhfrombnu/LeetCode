
public class Solution {
	public static void main(String[] args) {
		//String s = "Hello World";
		String s = "   ";
		int result = lengthOfLastWord(s);
		System.out.println(result);
		System.out.println("Hello World");
	}
    public static int lengthOfLastWord(String s) {
    	// find end
    	int start, end;
    	for(end = s.length() - 1; end >= 0; end --) {
    		if(s.charAt(end) != ' ') {
    			break;
    		}
    	}
    	for(start = end - 1; start >= 0; start --) {
    		if(s.charAt(start) == ' ') {
    			return end-start;
    		}
    	}
        return end + 1;
    }
}
