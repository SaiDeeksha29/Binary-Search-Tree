package com.blz.training;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyBinaryTreeTest {

	@Test
	public void createBinaryTreeAddIntegersTest() {
		MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size=myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
	
}
