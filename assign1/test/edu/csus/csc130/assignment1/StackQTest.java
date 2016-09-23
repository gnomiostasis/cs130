package edu.csus.csc130.assignment1;

import org.junit.Test;

import org.junit.Assert;

public class StackQTest {

	@Test
	public void testPushPopPeek() {
		String s = "DateStructuresAndAlgorithmAnalysis";
		StackI<Character> stack = new StackQ<Character>();
		int[] positions = {1, 11, 21};
		int i = -1;
		for (int pos: positions) {
			while (i<pos) {
				i++;
				stack.push(s.charAt(i));
			}
			char c = stack.pop();
			Assert.assertEquals(s.charAt(i), c);
			Assert.assertEquals(s.charAt(i-1), (char) stack.peek());
		}
	}

	@Test
	public void testPushPeek() {
		String s = "DateStructuresAndAlgorithmAnalysis";
		StackI<Character> stack = new StackQ<Character>();
		int[] positions = {0, 10, 20};
		int i = -1;
		for (int pos: positions) {
			while (i<pos) {
				i++;
				stack.push(s.charAt(i));
			}
			Assert.assertEquals(s.charAt(i), (char) stack.peek());
		}
	}

	@Test
	public void testIsEmpty() {
		StackI<Integer> stack = new StackQ<Integer>();
		Assert.assertTrue(stack.isEmpty());
		
		int n = 10;
		for (int i=0; i<n; i++) {
			stack.push(i);
		}
		Assert.assertFalse(stack.isEmpty());
		
		int m = 6;
		for (int i=0; i<m; i++) {
			stack.pop();
		}
		Assert.assertFalse(stack.isEmpty());
		
		for (int i=0; i<n-m; i++) {
			stack.pop();
		}
		Assert.assertTrue(stack.isEmpty());
	}

	@Test
	public void testSize() {
		StackI<Integer> stack = new StackQ<Integer>();
		Assert.assertEquals(0, stack.size());
		
		int n = 10;
		for (int i=0; i<n; i++) {
			stack.push(i);
		}
		Assert.assertEquals(n, stack.size());
		
		int m = 6;
		for (int i=0; i<m; i++) {
			stack.pop();
		}
		Assert.assertEquals(n-m, stack.size());
		
	}

}
