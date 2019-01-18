/*
 * Author: Niall Mc Guinness
 * 
 * */


public class ArrQueue<T> implements Queue<T>{
	
	private T[] queue;
	private int size, front, rear, capacity;
	
	//Constructors 
	
	public ArrQueue(){
		capacity = 1000;
		front = 0;
		rear = 0;
		queue = (T[]) new Object[capacity];
	}

	public ArrQueue(int capacity) {
		
		this.capacity = capacity;
		front = 0;
		rear = 0;
		queue = (T[]) new Object[capacity];
	}
	
	//Adds an element to the 'back' of the queue
	@Override
	public void enqueue(T data) {
		
		if(size == capacity) throw new QueueFullException();
		
		queue[rear] = data;
		rear = (rear + 1) % capacity;
		size++;
		
		return;
	}

	//Removes the 'front' element of the queue
	@Override
	public T dequeue() {
		
		if(isEmpty()) throw new QueueEmptyException();
		
		T data = queue[front];
		queue[front] = null;
		front = (front + 1) % capacity;
		size--;
		return data;
	}

	//Returns the front element of the queue
	@Override
	public T front() {
		return queue[front];
	}

	//Returns T/F depending on the statement returned. Checks if Array is empty
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	//Returns the size of the Queue Array
	@Override
	public int size() {
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
		ArrQueue<Integer> q = new ArrQueue<Integer>(20);
		
		q.enqueue(10);
		System.out.println(q.toString());
		q.enqueue(20);
		System.out.println(q.toString());
		q.enqueue(30);
		System.out.println(q.toString());
		q.enqueue(40);
		System.out.println(q.toString());
		q.dequeue();
		System.out.println(q.toString());

		q.dequeue();
		System.out.println(q.toString());
		
		System.out.println("Front element: " + q.front());

		q.dequeue();
		System.out.println("Front element: " + q.front());

	}

}
