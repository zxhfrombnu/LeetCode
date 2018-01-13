
public class Solution {
	public static void main(String[] args) {
		String[] strs = {"abc", "", "abe"};
		String subString = strs[0].substring(0, 0);
		System.out.println(subString);
		String result = longestCommonPrefix(strs);
		System.out.println(result);
		System.out.println("Hello World");
	}

    public static String longestCommonPrefix(String[] strs) {
    	if(strs.length == 0) {
    		return "";
    	}
    	String result = strs[0];
    	for(int i = 1; i < strs.length; i++) {
    		//indexOf : Returns the index within this string of the first occurrence of the specified substring.
    		while(strs[i].indexOf(result) != 0)
    			//The substring begins at the specified beginIndex and extends to the character at index endIndex - 1
    			result = result.substring(0, result.length() - 1);
    	}
    	return result;
    }
}
