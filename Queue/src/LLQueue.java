
public class LLQueue<T> implements Queue<T> {

	public class Node {
		T data;
		Node next;
		
		Node(T data){
			this.data = data;
		}
	}
	
	private Node first, last;
	private int size;
	
	LLQueue(){
		first = null;
		last = null;
		size = 0;
	}
	
	@Override
	public void enqueue(T data) {
		// TODO Auto-generated method stub
		Node lastElem = last;
		last = new Node(data);
		last.next = null;
		size++;
		return;
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T front() {
		// TODO Auto-generated method stub
		return first.data;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return first == null;
	}

	@Override
	public int size() {
		return size;
	}
	
	public String toString() {
	       
	      String out = "[" + size + " element(s)]: ";
	      Node n = first;
	      while ( n != null ) {
	         out += "[-|" + n + "|-] ->";
	         n = n.next;
	      }
	      return out;
	   }
	
	public static void main(String[] args) {
		
		LLQueue<Integer> l = new LLQueue<Integer>();
		
		l.enqueue(2);
		System.out.println(l.toString());
		l.enqueue(2);
		System.out.println(l.toString());

	}

}
