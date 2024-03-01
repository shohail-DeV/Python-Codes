package Section026;
import java.util.Scanner;
class stack{
	int info;
	stack link;
}
class stackLinked{
stack TOP=null;
void PUSH(int item) {
	stack p=new stack();
	p.info=item;
	p.link=null;
	if(TOP==null) {
		TOP=p;
	}
	else {
		p.link=TOP;
		TOP=p;
	}
}
 void POP() {
	if(TOP==null) {
		System.out.println("Underflow");
	}
	else {
	System.out.println("Item deleted is "+TOP.info);
	TOP=TOP.link;
	}
}
void traverse() {
	stack s=TOP;
	while(s!=null) {
		System.out.println(s.info);
		s=s.link;
	}
}
}
public class stackLinkedList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c;
		stackLinked s=new stackLinked();
		while(true) {
		System.out.println("----------Menu-----------");
		System.out.println("0. Exit");
		System.out.println("1. PUSH");
		System.out.println("2. POP");
		System.out.println("3. Traverse");
		System.out.println("Enter your choice");
		c=sc.nextInt();
		switch(c) {
		case 0:System.exit(0);
				break;
		case 1:	System.out.println("Enter the element");
				int ele=sc.nextInt();
				s.PUSH(ele);
				break;
		case 2:s.POP();
				break;
		case 3:s.traverse();
				break;
		}
		}
	}
}
