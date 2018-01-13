public class Solution {
	public static void main(String[] args) {
		int x = 123;
		int result = reverse(x);
		System.out.println(result);
	}
    public static int reverse(int x) {
    	int result = 0;
    	while(x != 0) {
    		int tail = x % 10;
    		int newResult = result * 10 + tail;
    		// in case of overflow
    		if ((newResult - tail) / 10 != result) {
    			return 0;
    		}
    		result = newResult;
    		x = x / 10;
    	}
    	return result;
    }
}