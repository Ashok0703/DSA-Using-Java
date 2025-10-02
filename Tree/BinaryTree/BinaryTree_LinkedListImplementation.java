package Tree.BinaryTree;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
public class BinaryTree_LinkedListImplementation {
	Node root;
	void insertroot(int d) {
		Node newnode=new Node(d);
		root=newnode;
	}
	void insertleft(Node n,int d) {
		if(root!=null) {
			Node newnode=new Node(d);
			n.left=newnode;
		}
	}
	void insertright(Node n,int d) {
		if(root!=null) {
			Node newnode=new Node(d);
			n.right=newnode;
		}
	}
	void inorder(Node r) {
		if(r!=null) {
			inorder(r.left);
			System.out.println(r.data);
			inorder(r.right);
		}
	}
	void search(Node r,int d) {
		if(r!=null) {
			search(r.left,d);
			if(r.data==d) {
				System.out.println("Founded");
			}
			search(r.right,d);
		}
	}
	public static void main(String args[]) {
		BinaryTree_LinkedListImplementation tree=new BinaryTree_LinkedListImplementation();
		tree.insertroot(0);
		tree.insertleft(tree.root, 1);
		tree.insertright(tree.root, 2);
		tree.insertleft(tree.root.left,3);
	
		tree.insertright(tree.root.left,4);
		tree.inorder(tree.root);
		tree.search(tree.root,3);
		
	}
	
	}
	


