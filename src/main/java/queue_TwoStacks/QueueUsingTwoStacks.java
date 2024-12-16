package queue_TwoStacks;

import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		
	QueueUsingTwoStacks qu = new  QueueUsingTwoStacks();
		 qu.enqueue(3);
		 qu.enqueue(4);
		 qu.enqueue(5);
		 qu.dequeue();
		 qu.enqueue(7);
		 qu.enqueue(6);
		 qu.dequeue();
		 qu.dequeue();
		 qu.dequeue();
		 qu.dequeue();
		 qu.dequeue();

	}
	
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	
		public void enqueue(int value) {
		stack1.push(value);
	}
	
	public void dequeue() {
		if(stack2.isEmpty()) {
			if(stack1.isEmpty()) {
				System.out.println("can not dequeue value the Queue is Empty");
			}
		
		else{
			
		while (!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
			
		}	
	}
		
		System.out.println(stack2.pop());
		
	}

}
