import java.util.Iterator;


public class LinkedVector<T> implements Vector<T>, Iterable<T> {
	
	public class Node {
		T data;
		Node next;
		Node prev;
		
		Node(T data){
			this.data = data;
		}
	}
	
	private Node front;
	private Node back;
	private int size;
	
	LinkedVector(){
		front = back = null;
		size = 0;
	}


	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public T elemAtRank(int rank) {
		
		int currentPosition = 0;
		Node dummy = front;
		
		while(currentPosition < rank) {
			dummy = dummy.next;
			currentPosition++;
		}
		return dummy.data;
	}

	@Override
	public T replaceAtRank(int rank, T element) {
		
		int currentPosition = 0;
		Node newNode = new Node(element);
		Node dummy = front;
		
		if(front == null || rank == 0) {
			front = newNode;
			back = newNode;
			size++;
			return dummy.data;
		}	
		
		while(currentPosition < rank - 1) {
			dummy = dummy.next;
			currentPosition++;
		}
			
		Node newLink = dummy.next.next;
		dummy.next = newNode;
		newNode.next = newLink;
		size--;		
		System.out.println(newLink.data);


		size++;
		return newLink.data;
	}

	@Override
	public void insertAtRank(int rank, T element) {
		
		int currentPosition = 0;
		Node newNode = new Node(element);
		Node dummy = front;
		
		if(front == null || rank == 0) {
			front = newNode;
			back = newNode;
			size++;
			return;
		}	
		
		while(currentPosition < rank - 1) {
			dummy = dummy.next;
			currentPosition++;
		}

		Node nodeAtPosition = dummy.next;
		dummy.next = newNode;
		dummy = dummy.next;
		dummy.next = nodeAtPosition;
		size++;
		return;
	}

	@Override
	public T removeAtRank(int rank) {
				
		int currentPosition = 0;
		Node dummy = front;
		
		while(currentPosition < rank - 1) {
			dummy = dummy.next;
			currentPosition++;
		}
		
		Node newLink = dummy.next.next;
		dummy.next = newLink;
		size--;
		return dummy.data;
	}
	
	public String toString() {
		Node temp = front;
		for(int i = 0; i < size(); i++) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		return "";
	}


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		
		LinkedVector<Integer> ls = new LinkedVector<Integer>();
		
		ls.insertAtRank(0, 1);
		ls.toString();
		System.out.println();

		ls.insertAtRank(1, 2);
		ls.toString();
		System.out.println();

		ls.insertAtRank(2, 3);
		ls.toString();
		System.out.println();

		ls.insertAtRank(1, 4);
		ls.toString();
		System.out.println();

		ls.insertAtRank(4, 5);
		ls.toString();
		System.out.println();

		ls.insertAtRank(5, 6);
		ls.toString();
		System.out.println();

		ls.insertAtRank(6, 7);
		ls.toString();
		System.out.println();

		ls.insertAtRank(7, 8);
		ls.toString();
		System.out.println();

		ls.removeAtRank(4);
		ls.toString();
		System.out.println();

		ls.removeAtRank(4);
		ls.toString();
		System.out.println();

		
		ls.replaceAtRank(1, 10);
		ls.toString();
		System.out.println();
		
		System.out.println("Element at rank 2: " + ls.elemAtRank(2));

		System.out.println("Element at rank 1: " + ls.elemAtRank(1));
		
		System.out.println("Element at rank 3: " + ls.elemAtRank(3));

	}
}
