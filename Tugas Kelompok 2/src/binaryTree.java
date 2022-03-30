public class binaryTree {
    
    public void preOrder(Node root) {
        if(root == null) {
			return;
		}
        System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void main(String args[]) {
		Node root = new Node("Batu Bata, ");
		root.left = new Node(" Non Bakar, ");
		root.right = new Node(" Bakar, ");
		root.left.left = new Node(" Bata Kapur Putih, ");
		root.left.right = new Node(" Bata Merah Interlock, ");
        root.right.left = new Node(" Bata Merah, ");
        root.right.right = new Node(" Bata Hebel, ");

				
		binaryTree treeOrder = new binaryTree();
		
		//PreOrder traversal
        System.out.println(" ");
        System.out.println("Hasil PreOrder:");
        System.out.println(" ");
		treeOrder.preOrder(root);
		System.out.println(" ");
		
		//InOrder traversal
        System.out.println(" ");
        System.out.println("Hasil InOrder:");
        System.out.println(" ");
		treeOrder.inOrder(root);
		System.out.println(" ");
		
		//PostOrder traversal
        System.out.println(" ");
        System.out.println("Hasil PostOrder:");
        System.out.println(" ");
		treeOrder.postOrder(root);
		System.out.println(" ");
	}
}

class Node {
	String data;
	Node left;
	Node right;
	
	Node(String string) {
		data = string;
		left = right = null;
	}
}

