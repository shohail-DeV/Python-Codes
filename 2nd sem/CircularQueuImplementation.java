class CQueue{
	int front;
	int rear;
	int max=5;
	int CQ[];
	CQueue(){
		front=rear=-1;
		CQ=new int[max];
	}
	void enQueue(int element) {
		if((front ==0 && rear==max-1)||(front==rear+1))
			System.out.println("Queue is full");
		else {
			if (front==-1)
				front=0;
			rear=(rear+1)%max;
			CQ[rear]=element;
		}
	}
	void deQueue() {
		if(front==-1)
			System.out.println("Queue is empty");
		else {
			int e=CQ[front];
			System.out.println(e);
			if(front ==rear) {
				front=rear=-1;
			}
			else {
			front=(front+1)%max;
			}
			}
		}
	void display() {
		if(front<rear) {
		for(int i=front;i<=rear;i++)
			System.out.print(CQ[i]);
		}
		else {
			for(int i=front;i<max;i++)
				System.out.print(CQ[i]+" ");
			for(int i=0;i<=rear;i++)
				System.out.print(CQ[i]+" ");
			}
			}
		
	}

public class CircularQueuImplementation {

	public static void main(String[] args) {
		CQueue q=new CQueue();
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
		
		
		q.enQueue(10);
		q.enQueue(11);
		q.display();

	}

}
