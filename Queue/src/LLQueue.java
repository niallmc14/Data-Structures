
public class LLQueue<T> implements Queue<T> {

	public class Node {
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
		}
	}
	
	private Node front, rear;
	private int size;
	
	LLQueue(){
		front = null;
		rear = null;
		size = 0;
	}
	
	@Override
	public void enqueue(T data) {
		// TODO Auto-generated method stub
		Node lastElem = new Node(data);
		if(rear == null) {
			front = lastElem;
		}else {
			rear.next = lastElem;
		}
		
		rear = lastElem;
		size++;
		return;
	}

	@Override
	public T dequeue() {
		
		T data = front.data;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		else {
			data = null;
		}
		size--;
		return data;
	}

	@Override
	public T front() {
		return front.data;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front == null;
	}

	@Override
	public int size() {
		return size;
	}
	
	public String toString() {
	       
	      String out = "[" + size + " element(s)]: ";
	      Node n = front;
	      while ( n != null ) {
	         out += "<-[-|" + n.data + "|-]";
	         n = n.next;
	      }
	      return out;
	   }
	
	public static void main(String[] args) {
		
		LLQueue<Integer> l = new LLQueue<Integer>();
		
		l.enqueue(10);
		System.out.println(l.toString());
		l.enqueue(20);
		System.out.println(l.toString());
		l.enqueue(30);
		System.out.println(l.toString());
		l.enqueue(40);
		System.out.println(l.toString());
		l.dequeue();
		System.out.println(l.toString());

		l.dequeue();
		System.out.println(l.toString());
		
		System.out.println("Front element: " + l.front());
		l.enqueue(50);
		System.out.println(l.toString());
		l.dequeue();
		System.out.println(l.toString());

		System.out.println("Front element: " + l.front());

	}

}
