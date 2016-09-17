package trees;

import org.junit.Test;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.BeforeClass;

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
		// TODO Auto-generated method stub
		super.tearDown();
	}
}
