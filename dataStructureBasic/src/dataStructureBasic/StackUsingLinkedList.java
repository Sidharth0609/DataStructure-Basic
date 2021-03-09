package dataStructureBasic;

public class StackUsingLinkedList {

	private class Node {
		int data;
		Node link;
	}
	Node top;
	StackUsingLinkedList()
	{
		this.top=null;
	}
	public void push(int x) {
		Node temp = new Node();
		
			temp.data=x;
			temp.link=top;
			top=temp;
		}
	
		public boolean isEmpty() {
			return top==null;
		}
		public int peek() {
			if(!isEmpty()) {
				return top.data;	
			}
			else {
				System.out.println("Stack is empty");
				return -1;
			}
		}
		public void pop() {
			if (top==null) {
			System.out.println("Stack Underflow");
			return;
			}
			System.out.println("Popped element "+ top.data);
			top=top.link;
		}
		public void display() {
			Node temp = top;
			while(temp!= null) {
				System.out.println(temp.data+ " ");
				temp=temp.link;
			}
		}
	public static void main(String[] args) {
		StackUsingLinkedList obj = new StackUsingLinkedList();
		obj.push(2);
		obj.push(1);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.display();
		System.out.println("Top element  is  " + obj.peek());
		obj.pop();
		obj.pop();

	}

}
