
public class Solution {
	public static void main(String[] args) {
		//int nums[] = {3, 2, 2, 3};
		int nums[] = {3, 2, 3, 1, 3, 2, 3};
		//int nums[] = {3, 3, 3};
		int val = 3;
		int num = removeElement(nums, val);
		System.out.println(num);
		System.out.println("Hello World");
	}

    public static int removeElement(int[] nums, int val) {
    	int index = 0;
    	for(int i = 0; i < nums.length; i++) {
    		if(nums[i] != val) {
    			nums[index++] = nums[i];
    		}
    	}
    	return index;
    }
}
