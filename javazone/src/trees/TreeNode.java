package trees;

public class TreeNode<E> {
	
	private E value;
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode(E value, TreeNode<E> parent) { // for root node parent = null
		this.value = value;
		this.parent = parent;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode<E> addLeftChild(E val) {
		this.left = new TreeNode<>(val, this);
		return this.left;
	}

	
	public TreeNode<E> addRightChild(E val) {
		this.right = new TreeNode<>(val, this);
		return this.right;
	}
	
	public TreeNode<E> getLeftChild() {
		return this.left;
	}
	
	public TreeNode<E> getRightChild() {
		return this.right;
	}

	public void visit() {
		System.out.println("Visited:"+value.toString());
	}
}
