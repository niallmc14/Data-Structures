
public class ArrQueue<T> implements Queue<T>{
	
	private T[] queue;
	private int size, front, rear, capacity;
	private static final int MAX_SIZE = 16;

	public ArrQueue(int capacity) {
		this.capacity = capacity;
		
		front = 0;
		rear = 0;
		queue = (T[]) new Object[capacity];
	}
	@Override
	public void enqueue(T data) {
		// TODO Auto-generated method stub
		
		if(size == MAX_SIZE) throw new QueueFullException();
		
		queue[rear] = data;
		rear = (rear + 1) % capacity;
		size++;
		
		return;
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		T data = queue[front];
		queue[front] = null;
		front = (front + 1) % capacity;
		size--;
		return data;
	}

	@Override
	public T front() {
		// TODO Auto-generated method stub
		return queue[front];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public String toString() {
		String out = "[" + size() + " / " + queue.length + "]";
		for (int i = 0;i < queue.length; i++) {
			
			out += " " + queue[i];
		}
		return out;
	}
	
	public static void main(String[] args) {
		ArrQueue<Integer> q = new ArrQueue<Integer>(14);
		
		q.enqueue(10);
		q.enqueue(10);
		q.dequeue();
		System.out.println(q.toString());
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.dequeue();
		System.out.println(q.toString());
	}

}
