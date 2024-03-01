package Regd_2141016146;
import java.util.*;
public class Methods {
	Node head;
	Scanner in = new Scanner(System.in);
	void create() {
		Node p=new Node();
	System.out.println("Input node value");
	p.info=in.nextInt();
	p.link=null;
	head=p;
	System.out.println("Do you want to add more nodes (1/0)");
	int op=in.nextInt();
	while(op!=0) {
		Node q=new Node();
		System.out.println("Input node value");
		q.info=in.nextInt();
		q.link=null;
		p.link=q;
		p=q;
		System.out.println("Do you want to add more nodes (1/0)");
		op=in.nextInt();
	}
	}
	void display() {
		System.out.println(head);
	Node p=head;
	while(p!=null) {
		System.out.print(p.info+" -> ");
	p=p.link;
	}
	System.out.println("null");
	}
	int find2ndMax()
	{
	    int i, pt1,pt2;
	 Node p=head;
	    int count = 0;
	    while (p != null)
	    {
	        count++;
	        p=p.link;
	    }
	    if (count < 2)
	    {
	        return -1;
	    }
	    pt1 = pt2 = Integer.MIN_VALUE;
	    Node temp = head;
	    while (temp != null)
	    {
	        if (temp.info > pt1)
	        {
	           pt2 = pt1;
	          pt1 = temp.info;
	        }
	        else if (temp.info > pt2 && temp.info != pt1)
	            pt2 = temp.info;
	        temp = temp.link;
	    }	 
	    if (pt2 == Integer.MIN_VALUE)
	       return -1;
	    else
	        return pt2;
	}
void search(int n) {
Node p=head;
	if (p == null) {
        System.out.println("List is empty");;
    }

    int index = 0;
    Node temp = head;
while (temp != null) {
        if (temp.info == n) {
            System.out.println("The element "+n+"if found at index="+index);
        }
        index++;
        temp=temp.link;
}
System.out.println("Element not found");
}
void removeDuplicate() {
	Node thead=null;
	Node nthead=null; 
    thead=head;
while (thead != null && thead.link != null) {
        nthead = thead;
        while (nthead.link != null) {
            if (thead.info == nthead.link.info) {
                nthead.link = nthead.link.link;
            }
            else{
                nthead=nthead.link;
            }
        }
        thead = thead.link;
    }
}
int countUnique() {
	int count=0;
	  Node  p=head;
	  Node q=head;
	  int n=0;
	  while (q != null)
	  {
		  n++;
		  q=q.link;
	  }
	  int arr[]=new int[n+1];
	  while(p!=null) {
		  if(arr[p.info]<1) {  
			  count++;
		  }
		  arr[p.info]++;
		  p=p.link;
		}
		return count;
	}
}


