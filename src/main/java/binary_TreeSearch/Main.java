package binary_TreeSearch;

public class Main {

	public static void main(String[] args) {
		
		BinaryTreeSearch tree = new BinaryTreeSearch();
		Node root = null;
		
		root = tree.insert(root,8);
		root = tree.insert(root,3);
		root = tree.insert(root,1);
		root = tree.insert(root,10);
		root = tree.insert(root,7);
		root = tree.insert(root,8);
		root = tree.insert(root,2);
		root = tree.insert(root,4);
		root = tree.insert(root,9);
		root = tree.insert(root,5);
		root = tree.delete(root,7);
				
		tree.printNode(root);
		
	}

}


