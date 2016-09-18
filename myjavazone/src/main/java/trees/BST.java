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
     * Constructor with root node value.
     *
     * @param rootValue
     */
    public BST(E rootValue) {
        this.root = new TreeNode<>(rootValue, null);
    }

    /**
     * Inserts a node containing value toInsert in BST. Returns true on success
     * false if node with same value is already present.
     *
     * @param toInsert
     * @return
     */
    public boolean insert(E toInsert) {
        TreeNode<E> curr = root;
        int comp = toInsert.compareTo(curr.getData());
        while ((comp < 0 && curr.getLeftChild() != null) || (comp > 0 && curr.getRightChild() != null)) {
            if (comp < 0) {
                curr = curr.getLeftChild();
            } else {
                curr = curr.getRightChild();
            }
            comp = toInsert.compareTo(curr.getData());
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
     * <h3>Deletes a node in BST</h3>
     * If node to be deleted is:
     * <ul>
     * <li>Has no children (leaf node). Easy case set parent's</li>
     * <li>Has 1 child: Medium.</li>
     * <li>Has 2 children: Little bit tricky. Find smallest element in right
     * subtree (will have null left child) say, minRight. Use this nodes value to update the node with value toDelete. Delete minRight from tree(Case 1).
     * </li>
     * </ul>
     *
     * @param toDelete
     * @return true on success false if no matching value.
     */
    public boolean delete(E toDelete) {
        
        return false;
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
        StringBuilder path = new StringBuilder();
        levelOrder(this.root, path);
        System.out.println("\nLevelOrderTraversalPath : " + path.toString());
    }

    /**
     *
     * @param node target traversal node
     * @param path traversal path
     */
    private void levelOrder(TreeNode<E> node, StringBuilder path) {
        if (node != null) {
            Queue<TreeNode<E>> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                TreeNode<E> curr = q.remove();
                if (curr != null) {
                    curr.visit();
                    path.append(curr.getData()).append(" ");
                    q.add(curr.getLeftChild());
                    q.add(curr.getRightChild());
                }
            }
        }
    }
}
