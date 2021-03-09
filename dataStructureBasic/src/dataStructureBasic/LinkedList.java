package dataStructureBasic;

public class LinkedList {

	class Node{
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head =null;
	public Node tail = null;
	
	public void addNode(Object data) {
	Node newNode = new Node(data);
	if(head==null) {
		head = newNode;
		tail = newNode;
	}
	else {
		tail.next=newNode;
		tail=newNode;
	}
}
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linkedlist: ");
		while(current!=null) {
			System.out.println(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addNode("Sid");
		list.addNode(1);
		list.addNode('S');
		list.addNode('K');
		list.addNode("Sidharth");
		
		list.display();
	}
}