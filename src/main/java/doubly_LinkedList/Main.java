package doubly_LinkedList;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkList a = new DoublyLinkList();
		
	    	Node head = null;	      	    	
	      head = a.insert(1, head);
	      head = a.insert(55,head);
	      head = a.insert(88,head);
	      head = a.insert(25,head);
	      head = a.insert(101, head);
	    
	      a.printListforword(head);
	     
		}

}


