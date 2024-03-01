package Section026;
import java.util.Scanner;
class Queue{
	int data;
	Queue link;
}
public class QueueLink {
	 Queue REAR= null;
	 Queue FRONT=null;
	 void Enqueue(int item) {
		Queue p=new Queue();
		p.data=item;
		p.link=null;
		if(FRONT == null) {
			REAR=p;
			FRONT=p;
		}
		else {
			REAR.link=p;
			REAR=p;	
		}
	}
	 void Dequeue() {
		if(FRONT==null) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("item to be deleted is"+FRONT.data);
			FRONT=FRONT.link;
		}
	}
	 void traverse() {
		Queue s=FRONT;
		System.out.println("Elements in the queue");
		while(s!=null) {
			System.out.print(s.data+"->");
			s=s.link;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c;
		QueueLink q=new QueueLink();
		while(true) {
		System.out.println("----------Menu-----------");
		System.out.println("0. Exit");
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. Traverse");
		System.out.println("Enter your choice");
		c=sc.nextInt();
		switch(c) {
		case 0:System.exit(0);
				break;
		case 1:
				System.out.println("Enter the element");
				int ele=sc.nextInt();
				q.Enqueue(ele);
				break;
		case 2:q.Dequeue();
				break;
		case 3:q.traverse();
				break;
		}
		}

	}

}
