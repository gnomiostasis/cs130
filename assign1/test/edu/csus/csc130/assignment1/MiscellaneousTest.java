package edu.csus.csc130.assignment1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

public class MiscellaneousTest {

	@Test
	public void testPowI_1() {
		int x = 2;
		int n = 0;
		Assert.assertEquals(Miscellaneous.powI(x, n), 1);
	}
	
	@Test
	public void testPowI_2() {
		int x = 2;
		int n = 1;
		Assert.assertEquals(Miscellaneous.powI(x, n), 2);
	}
	
	@Test
	public void testPowI_3() {
		int x = 2;
		int n = 2;
		Assert.assertEquals(Miscellaneous.powI(x, n), 4);
	}	
	
	@Test
	public void testPowI_4() {
		int x = 2;
		int n = 3;
		Assert.assertEquals(Miscellaneous.powI(x, n), 8);
	}		

	@Test
	public void testBinarySearch_1() {
		int[] a = {1, 3, 5, 7, 9};
		int key = 8;
		Assert.assertEquals(Miscellaneous.binarySearch(a, key), -1);
	}
	
	@Test
	public void testBinarySearch_2() {
		int[] a = {2, 2, 2, 2, 2, 2};
		int key = 2;
		Assert.assertEquals(Miscellaneous.binarySearch(a, key), 0);
	}	
	
	@Test
	public void testBinarySearch_3() {
		int[] a = {1, 2, 2, 2, 2, 2};
		int key = 2;
		Assert.assertEquals(Miscellaneous.binarySearch(a, key), 1);
	}		
	
	@Test
	public void testBinarySearch_4() {
		int[] a = {1, 2, 2, 2, 4, 4};
		int key = 4;
		Assert.assertEquals(Miscellaneous.binarySearch(a, key), 4);
	}	
	
	@Test
	public void testGetSelected_1() {
		List<Integer> items = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			items.add(i);
		}
		
		List<Integer> positions = new ArrayList<Integer>();
		positions.add(0);
		positions.add(9);
		
		List<Integer> result = Miscellaneous.getSelected(items, positions);
		Assert.assertEquals(result.size(), 2);
		Assert.assertEquals((int) result.get(0), 0);
		Assert.assertEquals((int) result.get(1), 9);
	}
	
	@Test
	public void testGetSelected_2() {
		List<Integer> items = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			items.add(i);
		}
		
		List<Integer> positions = new ArrayList<Integer>();
		positions.add(1);
		positions.add(8);
		positions.add(10);
		
		List<Integer> result = Miscellaneous.getSelected(items, positions);
		Assert.assertEquals(result.size(), 2);
		Assert.assertEquals((int) result.get(0), 1);
		Assert.assertEquals((int) result.get(1), 8);
	}	
	
	@Test
	public void testGetSelected_3() {
		List<Character> items = new ArrayList<Character>();
		String s = "abcdefghijklmnopqresuvwxyz";
		for (int i=0; i<s.length(); i++) {
			items.add(s.charAt(i));
		}
		
		List<Integer> positions = new ArrayList<Integer>();
		positions.add(0);
		positions.add(25);
		
		List<Character> result = Miscellaneous.getSelected(items, positions);
		Assert.assertEquals(result.size(), 2);
		Assert.assertEquals((char) result.get(0), s.charAt(0));
		Assert.assertEquals((char) result.get(1), s.charAt(25));
	}		
	
	@Test
	public void testGetSelected_4() {
		List<Character> items = new ArrayList<Character>();
		String s = "abcdefghijklmnopqresuvwxyz";
		for (int i=0; i<s.length(); i++) {
			items.add(s.charAt(i));
		}
		
		List<Integer> positions = new ArrayList<Integer>();
		positions.add(1);
		positions.add(24);
		positions.add(26);
		
		List<Character> result = Miscellaneous.getSelected(items, positions);
		Assert.assertEquals(result.size(), 2);
		Assert.assertEquals((char) result.get(0), s.charAt(1));
		Assert.assertEquals((char) result.get(1), s.charAt(24));
	}		

}
