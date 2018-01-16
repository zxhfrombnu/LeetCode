
public class Solution {
	public static void main(String[] args) {
		int nums[] = {1, 1, 1, 2};
		int len = removeDuplicates(nums);
		System.out.println(len);
		System.out.println("Hello World");
	}
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len < 2) {
        	return len;
        }
        int i = 0;
        int j = 1;
        for(; j<len; j++) {
        	if( nums[i] != nums[j]) {
        		// it's not the next one, so we should replace the value for the next element
        		if(i+1 != j) {
        			nums[i+1] = nums[j];
        		}
        		//update the base element
        		i++;
        	}
        }
        return i+1;
    }
}
