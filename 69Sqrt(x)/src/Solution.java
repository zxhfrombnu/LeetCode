
public class Solution {
	public static void main(String[] args) {
		int x = 0;
		//int x = Integer.MAX_VALUE;
		//int x = 2147395599;
		//int x = 1;
		int result = mySqrt(x);
		System.out.println(result);
		System.out.println("Hello World");
	}
    public static int mySqrt(int x) {
    	// left should not start with 0, or else will get /0 runtime error
    	int left = 1;
    	int right = x / 2 + 1;
    	while(left <= right) {
    		//int middle = (left + right) / 2;
    		int mid = left + (right - left) / 2;
    		if(mid == x / mid) {
    			return mid;
    		} else if(mid > x / mid) {
    			right = mid - 1;
    		} else if (mid < x / mid) {
    			left = mid + 1;
    		}
    	}
        return right;
    }
}
