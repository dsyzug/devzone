package trees;

public class TreeNode<E> {
	
	private E data;
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode(E value, TreeNode<E> parent) { // for root node parent = null
		this.data = value;
		this.parent = parent;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode<E> setLeftChild(E val) {
		this.left = new TreeNode<>(val, this);
		return this.left;
	}

	
	public TreeNode<E> setRightChild(E val) {
		this.right = new TreeNode<>(val, this);
		return this.right;
	}
	
	public TreeNode<E> getParent() {
		return this.parent;
	}
	
	public TreeNode<E> getLeftChild() {
		return this.left;
	}
	
	public TreeNode<E> getRightChild() {
		return this.right;
	}

	public void visit() {
		System.out.print(data + "->");
	}

	public E getData() {
		return data;
	}
}
