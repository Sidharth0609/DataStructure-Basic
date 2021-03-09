package dataStructureBasic;

public class QueueUsingArray {
	private static int front,rear,capacity;
	private static int queue[];
	
	QueueUsingArray(int c) {
		front = rear = 0;
		capacity = c;
		queue= new int[capacity];
	}
	 void queueEnqueue(int data) {
		if(capacity==rear) {
			System.out.println("Queue is full");
			return;
		}
		else {
			queue[rear] = data;
			rear++;
		}
		return;
	}
	
	 void queueDequeue () {
		if(front == rear) {
			System.out.println("Queue is empty");
			return;
		}
		
		else {
			for (int i=0;i<rear-1;i++) {
				queue[i]=queue[i+1];
			}
			if(rear<capacity) {
				queue[rear]=0;
				
			}
			rear--;	
		}
	}
		
		 void queueDisplay() {
			
			if(front==rear) {
				System.out.println("Queue is empty");
				return;
			}
			for(int i = front; i<rear;i++) {
				System.out.println(" " + queue[i]);
			}
			return;
		}
		static void queueFront() {
			if(front == rear) {
				System.out.println("Queue is empty");
				return;
			}
			System.out.println("Front element : "+ queue[front]);
			return;
		}
	
	public static void main(String[] args) {
		QueueUsingArray Q = new QueueUsingArray(4);
		Q.queueEnqueue(20);
		Q.queueEnqueue(30);
		Q.queueEnqueue(40);
		Q.queueEnqueue(50);
		Q.queueDisplay();
		System.out.println("");
		Q.queueDequeue();
		Q.queueDisplay();
	}

}

