package Regd_2141016146;
import java.util.*;
public class TestLinkedLIst{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	Methods l1 = new Methods();
	l1.create();
	int n=0;
	while(true) {
		System.out.println("****Menu****");
		System.out.println("0. Exit");
		System.out.println("1. Display the LinkedList");
		System.out.println("2. Find the 2nd largest element in LinkedList");
		System.out.println("3. To display references of all occurances of an element");
		System.out.println("4. To remove all nodes with duplicate elements");
		System.out.println("5. Count the number of unique elements");
		System.out.println("Enter your choice");
		n=in.nextInt();
		switch(n) {
		case 0:return;
		case 1:l1.display();
		break;
		case 2:
		System.out.println("The 2nd maximum element:"+l1.find2ndMax());
		break;
		case 3:
		System.out.println("Enter the element");
		int num=in.nextInt();
		l1.search(num);
		break;
		case 4:
		l1.removeDuplicate();
		System.out.println("Linked List after duplicate removal");
		l1.display();
		break;
		case 5:
		System.out.println("The no. of unique elements:"+l1.countUnique());
		break;
		default:
			System.out.println("Wrong choice");

		}
	}
	}
}
