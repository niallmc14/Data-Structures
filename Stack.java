
public class Stack {
	
	public int top, size, capacity;
	public int[] stack;
	
	Stack(int capacity){
		this.capacity = capacity;
		stack = new int[this.capacity];
		size = 0;
		top = -1;
	}
	
	public int size() {
		return size;
	}
	
	public void push(int data) {
		stack[++top] = data;
	}
	
	public int pop() {
		return stack[--top];
	}
	
	public int peek() {
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == capacity - 1);
	}
	
	public static void main(String[] args) {
		
		Stack s = new Stack(10);
		
		for(int i = 0; i < 10; i++) {
			s.push(i);
		}
		
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(20);
		s.push(13);
		System.out.println(s.pop());

	}
}
