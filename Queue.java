
//Must make it Generic for all types and objects
//

public class Queue<T> {
	
	private int[] queue;
	private int front, rear, size, capacity;

	Queue(int capacity){
		
		this.capacity = capacity;
		front = 0;
		rear = capacity - 1;
		queue = new int[capacity];
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full!");
		}
		
		rear = (rear + 1) % capacity;
		queue[rear] = data;
		size += 1;
		System.out.println(data + " queued.");
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty!");
		}
		
		int data = queue[front];
		front = (front + 1) % capacity;
		size -= 1;
		return data;
	}
	
	public boolean isEmpty() {
		return (front == 0);
	}
	
	public boolean isFull(){
		return (size >= capacity);
	}
	
	public int size() {
		return this.size;
	}
	
	public int front() {
		return queue[front];
	}
	
	public int rear() {
		return queue[rear];
	}
	public static void main(String[] args) {
		Queue q = new Queue(10);
		
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		q.enqueue(10);
		System.out.println("Front element: " + q.front());
		q.enqueue(4);
		System.out.println("Front element: " + q.front());
		System.out.println(q.isEmpty());
		System.out.println("Rear element: " + q.rear());
		System.out.println("Size: " + q.size());
		System.out.println(q.dequeue() + " dequeued.");
		System.out.println("Size: " + q.size());
		System.out.println("Front element: " + q.front());
		q.enqueue(100);
		q.enqueue(42);
		q.enqueue(30);
		System.out.println(q.dequeue() + " dequeued.");
		System.out.println("Front element: " + q.front());
		System.out.println("Rear element: " + q.rear());
		System.out.println(q.dequeue() + " dequeued.");
		q.enqueue(23);
		System.out.println("Size: " + q.size());
		System.out.println("Rear element: " + q.rear());

	}
}
