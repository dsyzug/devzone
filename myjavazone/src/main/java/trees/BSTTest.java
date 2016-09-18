package trees;

public class BSTTest {
	
	/**
	 * Build BST rooted at "D"
	 *    D
	 *  B   F
	 * A C E  G
	 */
	public static void main(String[] args) {
		BST<String> tree = new BST<>("D");
		tree = new BST<>("D");
		tree.insert("B");
		tree.insert("C");
		tree.insert("A");
		tree.insert("F");
		tree.insert("E");
		tree.insert("G");
		
		tree.levelOrder();
	}

}
