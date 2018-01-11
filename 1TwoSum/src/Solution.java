import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		int[] numbers = {2, 11, 15, 7};
		int target = 9;
		int[] result = twoSum(numbers, target);
		
		System.out.println("Hello World");
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map numMap = new HashMap();
		for(int i = 0; i < nums.length; i++) {
			if(numMap.containsKey(target - nums[i])) {
				result[0] = (int)numMap.get(target - nums[i]);
				result[1] = i;
				return result;
			}
			numMap.put(nums[i], i);
		}
		return null;
	}
}
