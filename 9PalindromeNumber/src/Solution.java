
public class Solution {
	public static void main(String[] args) {
		int x = 1001;
		boolean result = isPalindrome(x);
		System.out.println(result);
	}

	//compare the head and tail
    public static boolean isPalindrome(int x) {
    	if (x < 0) return false;
    	// get how many digit
    	int digit = 1;
    	while( x/digit >= 10) {
    		digit = digit * 10;
    	}
    	
    	while( x > 0) {
    		// compare head and tail
    		if( x % 10 != x / digit) return false;
    		x = x % digit;
    		x = x / 10;
    		digit = digit / 100;
    	}
    	return true;
    }

	//reverse int
//	public static boolean isPalindrome(int x) {
//        if(x < 0) return false;
//        int y = x;
//        int res = 0;
//        while(y != 0) {
//            res = res * 10 + y % 10;
//            y /= 10;
//        }
//        return x == res;
//	}
}
