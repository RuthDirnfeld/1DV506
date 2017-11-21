package rd222dv_assign4.stack;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {

		StackMethods stack = new StackMethods();

		stack.push("worm"); // pushing elements to the stack
		stack.push("fly");
		stack.push("mouse");

		// Peek at the top of the stack.
		Object peekResult = stack.peek();
		System.out.println("Top of stack: " + peekResult);

		// Pop the stack and display the result.
		Object popResult = stack.pop();
		System.out.println("Popping this element: " + popResult);

		// Pop again.
		popResult = stack.pop();
		System.out.println("Popping this element: " + popResult);

		System.out.println("Stack Size: " + stack.size());

		popResult = stack.pop();
		System.out.println("Popping this element: " + popResult);

		System.out.println("Stack is empty: " + stack.isEmpty());

		stack.push("cat");

		peekResult = stack.peek();
		System.out.println("Top of stack: " + peekResult);

		System.out.println("Stack is empty: " + stack.isEmpty());

		System.out.println("Stack Size: " + stack.size());

		// Check iterator
		Iterator<Object> it = stack.iterator();
		while (it.hasNext()) {
			Object n = it.next();
			System.out.print("Element: " + n);
		}

	}

}
