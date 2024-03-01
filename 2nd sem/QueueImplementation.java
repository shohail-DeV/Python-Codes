class Queue{
	int front;
	int rear;
	int max=5;
	int Q[];
	Queue(){
		front=rear=-1;
		Q=new int[max];
	}
	void enQueue(int element) {
		if(rear==max-1)
			System.out.println("Queue is full");
		else {
			if (front==-1)
				front=0;
			rear++;
			Q[rear]=element;
		}
	}
	void deQueue() {
		if(front==-1)
			System.out.println("Queue is empty");
		else {
			int e=Q[front];
			System.out.println(e);
			if(front >=rear) {
				front=rear=-1;
			}
			else {
			front++;
			}
			}
		
	}
	void display() {
		for(int i=front;i<=rear;i++)
			System.out.println(Q[i]);
	}
}
public class QueueImplementation {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		q.display();
		System.out.println("Element Deleted");
		q.deQueue();
		q.deQueue();
		q.deQueue();
		System.out.println();
		q.enQueue(10);
	}

}
