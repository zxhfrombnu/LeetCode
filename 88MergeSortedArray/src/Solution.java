
public class Solution {
	public static void main(String[] args) {
		int [] nums1 = new int[6];
		nums1[0] = 11;
		nums1[1] = 41;
		nums1[2] = 91;
		int [] nums2 = new int[] {92, 95, 98};
		merge(nums1, 3, nums2, 3);
		System.out.println("Hello World");
	}
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(i >= 0 && j >= 0) {
        	nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j >= 0) {
        	nums1[k--] = nums2[j--];
        }
    }
}
