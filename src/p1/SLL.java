package p1;
import java.util.*;
class Node{
	int data;
	Node next;
	public Node(int data) {
		//super();
		this.data = data;
		//this.next = next;
	}
}

public class SLL {

	public static void main(String[] args) {
		
		Node head = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);

		
		//insert at end
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		Node curr1 = head;
		while(curr1 != null) {
			System.out.print(curr1.data+"-->");
			curr1 = curr1.next;
		}
		
		System.out.println();
		//insert 15 b/w 10 and 20
		Node n5 = new Node(15);
		head.next = n5;
		n5.next = n3;
		
		Node curr2 = head;
		while(curr2 != null) {
			System.out.print(curr2.data+"-->");
			curr2 = curr2.next;
		}
		
		System.out.println();
		//insert 5 before 10
		Node n6 = new Node(5);
		n6.next = head;
		head = n6;
		
		
		
		
		//print linked list in reverse order using stack
		Stack<Integer> st = new Stack<Integer>();
		
		Node curr3 = head;
		while(curr3 != null) {
			st.push(curr3.data);
			System.out.print(curr3.data+"-->");
			curr3 = curr3.next;
		}
		
		Node zeroth = new Node(0);
		Node rev = zeroth;
		
		while(!st.isEmpty()) {
			Node newNode = new Node(st.pop());
			rev.next = newNode;
			rev = newNode; 
			
		}
		System.out.println();
		System.out.println("Reversed linked list: ");
		
		Node node = zeroth.next;
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		
		
	}

}
