import java.util.Iterator;

public class LinkedVector<T> implements Vector<T>{

	public class Node {
		T data;
		Node next;
		Node prev;
		
		Node(T value){
			data = value;
		}
	}
	
	private int size;
	private Node front; 
	private Node back;
	
	LinkedVector(){
		this.size = 0;
		front = back = null;
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
		
		Node dummy = new Node(null);
		dummy.next = front;
		
		for(int i = 0; i <= size; i++) {
			dummy.hasNext();
		}
		
		
		return null;
	}

	@Override
	public T replaceAtRank(int rank, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertAtRank(int rank, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T removeAtRank(int rank) {
		// TODO Auto-generated method stub
		return null;
	}
	
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
            		Node dummy = new Node(null);
            		
                return ;
            }
        };
    }
}
