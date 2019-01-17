
public class LLStack<T> implements Stack<T> {
	
	public class Node {
		T data;
		Node next;
		
		Node(T value){
			data = value;
		}
	}
	
	private Node top = null;
	private int size = 0;

	@Override
	public int size() {
		return size;
	}

	@Override
	public T pop() {
		
		if(isEmpty()) throw new StackEmptyException();
		
		T toReturn = top.data;
		top = top.next;
		size--;
		return toReturn;
	}

	@Override
	public T top() {
		if(isEmpty()) throw new StackEmptyException();

		return top.data;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(T data) {
		Node d = new Node(data);
		d.next = top;
		top = d;
		size++;
		return;
	}
	
	public String toString() {
	       
	      String out = "[" + size + " element(s)]: ";
	      Node n = top;
	      while ( n != null ) {
	         out += "<-[-|" + n.data + "|-] ";
	         n = n.next;
	      }
	      return out;
	   }
	
	public static void main(String[] args){
		
		LLStack<String> ll = new LLStack<String>();
		
		
		ll.push("Hello");
		System.out.println(ll.toString());
		
		ll.push("Whoever");
		System.out.println(ll.toString());
		
		ll.push("May");
		System.out.println(ll.toString());
		
		ll.push("Be");
		System.out.println(ll.toString());
		
		ll.push("be");
		System.out.println(ll.toString());
		
		ll.pop();
		
		ll.push("Running");
		System.out.println(ll.toString());
		
		ll.push("This.");
		System.out.println(ll.toString());
		
		ll.pop();
		System.out.println(ll.toString());

		ll.pop();
		System.out.println(ll.toString());

		ll.pop();
		System.out.println(ll.toString());

		ll.pop();
		System.out.println(ll.toString());

		ll.pop();
		System.out.println(ll.toString());

	}
}