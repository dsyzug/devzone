package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Generic Binary Tree (Refer to BST.java for Binary Search Tree related algorithms/methods)
 * Idea: Visit yourself Then visit all your left subtree Then visit all your
 * right subtree Example: A B C D E F G PreOrderTraversal: A->B->D->E->C->F->G
 * PostOrderTraversal: D->E->B->F->G->C->A InOrderTraversal: D->B->E->A->F->C->G
 * LevelOrderTraversal: A->B->C->D->E->F->G //Most Challenging of these 4. Note:
 * 1. LevelOrderTraversal is Breadth First Traversal 2. Pre/Post Order Traversal
 * is Depth First Traversal
 * 
 * @author dhirendra
 *
 */
public class BinaryTree<E> {

	TreeNode<E> root;

	public BinaryTree(E value) {
		this.root = new TreeNode<>(value, null);
	}

	public void preOrder() {
		preOrder(this.root);
	}

	public void postOrder() {
		postOrder(this.root);
	}

	public void inOrder() {
		inOrder(this.root);
	}

	public void levelOrder() {
		levelOrder(this.root);
	}

	/**
	 * Preorder using recursion.
	 * 
	 * @param node
	 */
	private void preOrder(TreeNode<E> node) {
		if (node != null) {
			node.visit();
			preOrder(node.getLeftChild());
			preOrder(node.getRightChild());
		}
	}

	private void postOrder(TreeNode<E> node) {
		if (node != null) {
			preOrder(node.getLeftChild());
			preOrder(node.getRightChild());
			node.visit();
		}
	}

	private void inOrder(TreeNode<E> node) {
		if (node != null) {
			preOrder(node.getLeftChild());
			node.visit();
			preOrder(node.getRightChild());
		}
	}

	private void levelOrder(TreeNode<E> node) {
		if (node != null) {
			Queue<TreeNode<E>> q = new LinkedList<>();
			q.add(root);
			while (!q.isEmpty()) {
				TreeNode<E> curr = q.remove();
				if (curr != null) {
					curr.visit();
					q.add(curr.getLeftChild());
					q.add(curr.getRightChild());
				}
			}
		}
	}
	
}
