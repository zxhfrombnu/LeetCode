
public class Solution {
	public static void main(String[] args) {
		//int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int[] A = {};
		int result = maxSubArray(A);
		System.out.println(result);
		System.out.println("Hello World");
	}

    public static int maxSubArray(int[] nums) {
    	//dp[i] means the maximum subarray ending with A[i];
    	int[] dp = new int[nums.length];
    	
    	dp[0] = nums[0];
    	int max = dp[0];
    	for(int i = 1; i < nums.length; i++) {
    		dp[i] = nums[i] + (dp[i-1] >= 0 ? dp[i-1] : 0);
    		max = Math.max(max, dp[i]);
    	}
    	return max;
    }
}
