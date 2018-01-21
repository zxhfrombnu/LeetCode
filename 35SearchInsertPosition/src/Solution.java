
public class Solution {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		int target = 0;
		int result = searchInsert(nums, target);
		System.out.println(result);
		System.out.println("Hello World");
	}
    public static int searchInsert(int[] nums, int target) {
    	for(int i = 0; ;) {
    		if(i == nums.length || nums[i] >= target) {
    			return i;
    		}
    		i++;
    	}
    }
}
