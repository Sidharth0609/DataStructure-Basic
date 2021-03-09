package dataStructureBasic;

class QNode {
	int key;
	QNode next;
	
	public QNode(int key) {
		this.key=key;
		this.next=null;
	}
}
public class QueueUsingLinkedList {
	QNode front,rear;
	public QueueUsingLinkedList() {
		this.front=this.rear=null;
	}
	void enqueue(int key) {
		QNode temp = new QNode(key);
		if (this.rear==null) {
			this.front=this.rear=temp;
			return;
		}
		this.rear.next = temp;
		this.rear=temp;
	}
	
	void dequeue() {
		if(this.front == null) {
			System.out.println("Queue is empty");
			return;
		}
		//QNode temp = this.front;
		System.out.println("Removed Element " + this.front.key);
		this.front=this.front.next;
		
		
		if(this.front == null) {
			this.rear = null;
		}
	}
	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.enqueue(1);
		q.enqueue(2);
		q.dequeue();
		q.dequeue();
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.dequeue();
		System.out.println("Queue Front :" + q.front.key);
		System.out.println("Queue Rear :" + q.rear.key);
	}

}
