
public class BinarySearchTree {
	
	class Node{
		
		int key;	
		Node left, right;
		
		public Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}
	
	Node root;
	
	//Constructor
	public BinarySearchTree() {
		root = null;
	}
	
	//Recursive insertion functions 
	public void insert(int key) {
		root = insertRec(root, key);
	}
	
	public Node insertRec(Node root, int key){
		
		if(root == null) {
			root = new Node(key);
			return root;
		}
		
		if(key < root.key) {
			root.left = insertRec(root.left,key);
		}
		else if(key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	//Recursive removal functions
	
	public void removeNode(int key) {
		root = removeNodeRecursive(root, key);
	}
	
	public Node removeNodeRecursive(Node root, int key) {
		
		if(root == null) {
			return root;
		}
		
		if(key < root.key) {
			root.left = removeNodeRecursive(root.left, key);
		}
		else if(key > root.key) {
			root.right = removeNodeRecursive(root.right, key);
		}
		else {
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null){
				return root.left;
			}
		}
		
		root.key = minValue(root.right);
		root.right = removeNodeRecursive(root.right, root.key);
		return root;
	}
	
	public int minValue(Node root) {
		
		int minValue = root.key;
		
		while(root.left != null) {
			minValue = root.left.key;
			root = root.left;
		}
		
		return minValue;
	}
	//Traverses the tree from left to right
	public void inorder() {
		inorderRecursive(root);
	}
	
	public void inorderRecursive(Node root) {
		if(root != null) {
			inorderRecursive(root.left);
			System.out.println(root.key);
			inorderRecursive(root.right);
		}
	}

	public Node searchNode(Node root, int key) {
		
		if(root == null || key == root.key) {
			return root;
		}
		
		if(root.key > key) {
			return searchNode(root.left, key);
		}
		return searchNode(root.right, key);
	}
	
	
	public static void main(String[] args) {
		
		BinarySearchTree bts = new BinarySearchTree();
		
		bts.insert(40);
		bts.insert(50);
		bts.inorder();
		bts.removeNode(40);
		System.out.println("");
		bts.insert(20);
		bts.insert(10);
		bts.insert(60);
		bts.insert(45);
		bts.removeNode(50);
		bts.inorder();
		
	}
}
