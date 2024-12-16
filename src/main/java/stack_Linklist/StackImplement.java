package stack_Linklist;

public class StackImplement {

public static void main(String[] args) {
	
	StackImplement stack = new StackImplement();
					
		stack.push(6);
		stack.push(11);
		stack.push(7);
		System.out.println(stack.popUp());		
		stack.push(3);
		stack.push(8);
		stack.push(5);
		stack.push(39);		
		System.out.println(stack.top());
		System.out.println(stack.popUp());
		System.out.println(stack.popUp());
		System.out.println(stack.popUp());
		System.out.println(stack.popUp());
		System.out.println(stack.popUp());
		System.out.println(stack.popUp());
		System.out.println(stack.popUp());
		System.out.println(stack.popUp());

	}
	
	Node front;	
	public Node getNewNode(int value) {
		Node node = new Node();
		node.data = value;
		node.next = null;
		return node;
	}

	public void push(int value) {
		if(front == null) {
		   front = getNewNode(value);
	       return;
		}
		
		Node temp = getNewNode(value);
		temp.next = front;
		front = temp;
	}
	
	public int popUp() {
		if(front == null) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;
		}
		
		int temp = front.data;
		front = front.next;
		return temp;
		
	}
	
	public int top() {
		if(front == null) {
			System.out.println("The Stack is Empty");
		}
		
		return front.data;
		
	}

}