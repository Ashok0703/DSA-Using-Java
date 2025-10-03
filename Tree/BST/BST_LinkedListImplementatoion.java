package Tree.BinaryTree.BST;

class Node {
	int data;
	Node left;
	Node right;

	Node(int d) {
		data = d;
		left = null;
		right = null;
	}
}

public class BST_LinkedListImplementatoion {
	Node root;

	public BST_LinkedListImplementatoion() {
		root = null;
	}

	// INSERT
	void insert(int d) {
		root = insertrec(root, d);
	}

	Node insertrec(Node root, int d) {
		if (root == null) {
			return new Node(d);
		}
		if (d < root.data) {
			root.left = insertrec(root.left, d);
		} else {
			root.right = insertrec(root.right, d);
		}
		return root;
	}

	// INORDER TRAVERSAL
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}

	// DELETE
	Node delete(Node root, int d) {
		if (root == null) {
			System.out.println("Tree is empty");
			return null;
		} else if (d < root.data) {
			root.left = delete(root.left, d);
		} else if (d > root.data) {
			root.right = delete(root.right, d);
		} else {
			// Node found
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			// Node with two children
			int minVal = minimum(root.right);
			root.data = minVal;
			root.right = delete(root.right, minVal);
		}
		return root;
	}

	// Find minimum value in a subtree
	int minimum(Node root) {
		if (root == null) {
			System.out.println("No tree exists");
			return -1; // or throw exception
		}
		while (root.left != null) {
			root = root.left;
		}
		return root.data;
	}

	// MAIN
	public static void main(String args[]) {
		BST_LinkedListImplementatoion b = new BST_LinkedListImplementatoion();
		b.insert(10);
		b.insert(20);
		b.insert(5);
		b.insert(2);
		b.insert(30);

		System.out.print("Inorder before deletion: ");
		b.inorder(b.root); 
		
		System.out.println("\nDeleting node 10 (has two children):");
		b.root = b.delete(b.root, 10);

		System.out.print("Inorder after deletion: ");
		b.inorder(b.root); // Output will reflect deletion of 10
	}
}
