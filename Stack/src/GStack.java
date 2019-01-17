
public class GStack<T> implements Stack<T>{
	
	private int capacity;
	private T[] stack;
	private int top = 0;
	
	GStack(int capacity){
		this.capacity = capacity;
		stack = (T[]) new Object[capacity];
	}
	
	@Override
	public int size() {
		return top;
	}

	@Override
	public T pop() {
		
		if(isEmpty()) throw new StackEmptyException();
		
		T e = stack[--top];
		stack[top] = null;
		
		return e;
	}

	@Override
	public T top() {
		if(top == 0) throw new StackEmptyException();
		
		return stack[top - 1];
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public void push(T data) {
		stack[top++] = data;
		return;
	}
	
	public String toString() {
		String out = "[" + top + " / " + stack.length + "]";
		for (int i = 0;i < stack.length; i++) {
			
			out += " " + stack[i];
		}
		return out;
	}
	
	public static void main(String[] args) {
		
		GStack<Integer> stack = new GStack<Integer>(5);
		
		stack.push(5);
		System.out.println(stack.toString());

		stack.push(10);
		System.out.println(stack.toString());

		stack.push(15);
		System.out.println(stack.toString());

		stack.push(20);
		System.out.println(stack.toString());

		stack.push(30);
		System.out.println(stack.toString());
				
		stack.pop();
		System.out.println(stack.toString());
		
		stack.pop();
		System.out.println(stack.toString());
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.toString());

	}

}
