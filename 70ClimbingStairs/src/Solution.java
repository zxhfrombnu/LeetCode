
public class Solution {
	public static void main(String[] args) {
		int n = 2;
		int result = climbStairs(n);
		System.out.println(result);
		System.out.println("Hello World");
	}
	
    public static int climbStairs(int n) {
        if(n < 2) {
        	return 1;
        }
        int oneStep = 1;
        int twoStep = 1;
        int result = 0;
        for(int i = 2; i <= n; i++) {
        	result = oneStep + twoStep;
        	twoStep = oneStep;
        	oneStep = result;
        }
        return result;
    }
    // it will cause Time Limit Exceeded
//    public static int climbStairs(int n) {
//        if(n <2) {
//        	return 1;
//        }
//        return climbStairs(n-1) + climbStairs(n-2);
//    }
}
