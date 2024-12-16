package doubly_LinkedList;

public class DoublyLinkList {
	
	public Node getNewNode(int i) {
		Node a = new Node();
		a.data = i;
		a.next = null;
		a.previous = null;
		return a;
	}
	
	public Node insert(int i,Node node) {
		if(node == null) {
			return getNewNode(i);
		}
		
		Node head = node;
		while(node.next != null) {
			node = node.next;
		}
		
		Node a = getNewNode(i);
		a.previous = node;
		node.next = a;
		return head;
	}
	
	public Node deleteNode(Node head , int data) {
		if(head == null) {
			return head;
		}
		if(head.data == data) {
			if(head.next != null) {
				head.next.previous = null;
			}
			return head.next;
		}
		return head;
		
	}
	
	public void printListforword(Node node) {
		if(node == null) {
			return;
		}
		while(node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

}
