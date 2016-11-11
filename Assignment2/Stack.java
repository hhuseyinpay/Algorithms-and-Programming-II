package deu.findPair;

public class Stack {

	private Object stack[];
	private int top;

	public Stack(int amount) {

		stack = new Object[amount];
		top = -1;
	}

	public void push(Object obj) {
		if (isFull()) {
			System.out.println("Stack overflow");
		} else {
			top++;
			stack[top] = obj;
		}
	}

	public Object pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else {
			top--;
			return stack[top + 1];
		}
	}

	public Object peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		} else
			return stack[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top + 1 == stack.length);
	}

	public int size() {
		return top + 1;
	}
	public void clear() {
		top = -1;
	}
}
