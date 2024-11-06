package lab6;
import java.util.Stack;
public class Remove_Element_from_Stack {
	
	    public static void main(String[] args) {
	        // Declare a stack
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 1; i <= 10; i++) {
	            stack.push(i);
	        }

	        System.out.println("Stack after pushing 10 elements: " + stack);

	        for (int i = 1; i <= 4; i++) {
	            int removedElement = stack.pop();
	            System.out.println("Removed element: " + removedElement);
	        }

	        System.out.println("Stack after removing 4 elements: " + stack);
	   }
}


