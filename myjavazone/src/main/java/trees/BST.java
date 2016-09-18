package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Binary Search Tree Search/Insert Methods on a BST
 * 
 * @author dhirendra
 *
 * @param <E>
 */
public class BST<E extends Comparable<? super E>> {

	TreeNode<E> root;

	/**
	 * Constructor
	 * 
	 * @param rootValue
	 */
	public BST(E rootValue) {
		this.root = new TreeNode<>(rootValue, null);
	}

	public boolean insert(E toInsert) {
		TreeNode<E> curr = root;
		int comp = toInsert.compareTo(curr.getData());
		while ((comp < 0 && curr.getLeftChild() != null) || (comp > 0 && curr.getRightChild() != null)) {
			if (comp < 0){
				curr = curr.getLeftChild();
			} else {
				curr = curr.getRightChild();
			}
		}
		
		if (comp == 0) {
			return false; // element already present
		}

		if (comp < 0) {
			curr.setLeftChild(toInsert);
		} else {
			curr.setRightChild(toInsert);
		}
		return true;
	}

	/**
	 * Search for element E in binary search tree.
	 * 
	 * @param toFind
	 * @return
	 */
	public boolean contains(E toFind) {
		TreeNode<E> curr = root;
		int comp;
		while (curr != null) {
			comp = toFind.compareTo(curr.getData());
			if (comp < 0) {
				curr = curr.getLeftChild();
			} else if (comp > 0) {
				curr = curr.getRightChild();
			} else {
				return true;
			}
		}
		return false;
	}

	public void levelOrder() {
		levelOrder(this.root);
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
