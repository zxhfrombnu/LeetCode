
public class Solution {
	public static void main(String[] args) {
		String s = "VI";
		int result = romanToInt(s);
		System.out.println(result);
		System.out.println("Hello World");
	}
    public static int romanToInt(String s) {
    	int result = 0;
    	for(int i = s.length() - 1; i >= 0; i --) {
    		char c = s.charAt(i);
    		// Only need to note that for I, X and C<br>
    		// these three letters can be placed before other letters to form subtraction.<br>
    		switch(c) {
    		case 'I':
    			result += result >= 5 ? -1 : 1;
    			break;
    		case 'V':
    			result += 5;
    			break;
    		case 'X':
    			result += 10 * (result >= 50 ? -1 : 1);
    			break;
    		case 'L':
    			result += 50;
    			break;
    		case 'C':
    			result += 100 * (result >= 500 ? -1 : 1);
    			break;
    		case 'D':
    			result += 500;
    			break;
    		case 'M':
    			result += 1000;
    			break;
    		}
    	}
    	return result;
    }
}
