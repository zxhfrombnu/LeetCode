
public class Solution {
	public static void main(String[] args) {
		String a = "11";
		String b = "11";
		String result = addBinary(a, b);
		System.out.println(result);
		System.out.println("Hello World");
	}
    public static String addBinary(String a, String b) {
    	StringBuilder result = new StringBuilder();
    	int i = a.length() - 1;
    	int j = b.length() - 1;
    	int carry = 0;
    	while(i >= 0 || j >= 0) {
    		int sum = carry;
    		if(i >= 0) {
    			sum += a.charAt(i--) - '0';
    		}
    		if(j >= 0) {
    			sum += b.charAt(j--) - '0';
    		}
    		result.append(sum % 2);
    		carry = sum / 2;
    	}
    	if(carry != 0) {
    		result.append(carry);
    	}
    	// use StringBuilder reverse will be much easier.
    	return result.reverse().toString();
    }
}
