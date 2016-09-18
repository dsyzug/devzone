package trees;

import org.junit.Test;

import junit.framework.TestCase;

public class BinaryTreeTest extends TestCase {
	
	BinaryTree<String> tree;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		tree = new BinaryTree<>("A");//
	}

	@Test
	public void preOrderTraversalTest(){
		
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
