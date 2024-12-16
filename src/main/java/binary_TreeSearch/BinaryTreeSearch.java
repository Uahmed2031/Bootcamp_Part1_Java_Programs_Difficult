package binary_TreeSearch;

public class BinaryTreeSearch {
	
	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
	
	public Node insert(Node node , int val) {
		if(node == null) {
			return createNewNode(val);
		}
		if(val < node.data) {
			node.left = insert(node.left,val);
		}
		else if(val > node .data) {
			node.right = insert(node.right , val);
		}
		return node;
	}

	public void printNode(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + ",");
		printNode(node.left);
		printNode(node.right);
	}
	
	public void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " , ");
		inOrder(node.right);
	}
	public Node delete(Node node , int val) {
		if(node == null) {
			return null;
		}
		if(val < node.data) {
			node.left = delete(node.left,val);
		}
		else if(val> node.data) {
			node.right = delete(node.right , val);
		}
		else {
			if(node.left == null || node.right == null) {
				Node temp = null;
				//
				temp = node.left == null ? node.right : node.left;
				
				if(temp == null) {
					return null;
				}
				else{
					return temp;
				}
				
			}else {
				Node Successor = getSuccessor(node);
				node.data = Successor.data;
				node.right = delete(node,val);
			}
		}
		return node;
	}
	public Node getSuccessor(Node node) {
		if(node == null) {
			return null;
		}
		Node temp = node.right;
		while(temp.left != null) {
			temp = temp.left;
		}
		return temp;
	}

}
