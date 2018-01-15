import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		String str = "";
		//String str = "{)([]}";
		boolean result = isValid(str);
		System.out.println(result);
		System.out.println("Hello World");
	}
    public static boolean isValid(String s) {
    	if(s == null)
    		return true;
    	Stack<Character> stack = new Stack<Character>();
    	for( int i = 0; i < s.length(); i++) {
    		Character ch = s.charAt(i);
    		switch(ch) {
    		case '(':
    			stack.push(ch);
    			break;
    		case '[':
    			stack.push(ch);
    			break;
    		case '{':
    			stack.push(ch);
    			break;
    		case ')':
    			if(stack.isEmpty() || stack.pop() != '(')
    				return false;
    			break;
    		case ']':
    			if(stack.isEmpty() || stack.pop() != '[')
    				return false;
    			break;
    		case '}':
    			if(stack.isEmpty() || stack.pop() != '{')
    				return false;
    			break;
    		}
    	}
    	return stack.isEmpty();
    }
}
